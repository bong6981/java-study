package bongf.week15.study;

import java.util.function.Consumer;

public class LambdaScopeTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {

            int z = 2;

            //  여기서 y대신 x나, z로 바꾸면 에러 난다.
            //  "Lambda expression's parameter x cannot redeclare another local variable defined in an enclosing scope"
            //   외부함수의 범위(enclosing scope)에서 정의된 지역 변수 x를 재 정의 할 수 없다.
            // 람다는 람다를 감싸고 있는 메소드와 같은 스코프이기 때문에
            // 이미 z나 x를 정의한 것으로 인식한다.
            // 만약 이를 익명 클래스로 작성하면 에러가 발생하지 않는다.(아래 testShadowing) 익명 클래스는 쉐도잉 이슈가 있지만 람다는 없다.
            // 자세한 내용은 https://www.notion.so/758e363f9fb04872a604999f8af6a1ae
            Consumer<Integer> myConsumer = (y) ->
            {
                // The following statement causes the compiler to generate
                // the error "Local variable z defined in an enclosing scope
                // must be final or effectively final"
                //
                // z = 99;
                System.out.println("x = " + x); // 23
                System.out.println("y = " + y); // 23 매개변수로 넣어준
                System.out.println("z = " + z); // 2
                System.out.println("this.x = " + this.x); // 1
                System.out.println("LambdaScopeTest.this.x = " +
                        LambdaScopeTest.this.x); //0
            };

            myConsumer.accept(x);

            // 익명 클래스로 작성하면 'z'라고 써도 문제가 없다.
            Consumer<Integer> testShadowing = new Consumer<Integer>() {
                @Override
                public void accept(Integer z) {
                    System.out.println(z);
                }
            };

        }
    }

    public static void main(String... args) {
        LambdaScopeTest st = new LambdaScopeTest();
        LambdaScopeTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}

