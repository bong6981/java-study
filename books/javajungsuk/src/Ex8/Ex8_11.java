package Ex8;

public class Ex8_11 {



    public static void main(String[] args) {

        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println(e.getMessage()+ "에러메시지");
            e.printStackTrace();
            System.out.println("공간확보하세요");
        } catch (MemoryException me){
            System.out.println(me.getMessage() + "에러메시지");
            me.printStackTrace();
            System.gc();
            System.out.println("다시 설치 시도");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace())
            throw new SpaceException("설치공간부족");
        if(!enoughMemory())
            throw new MemoryException("메모리부족");
    }

    static void copyFiles() {}
    static void deleteTempFiles() { }
    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }


}


class SpaceException extends MemoryException {
    SpaceException(String msg) {
        super(msg);
    }
}


class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}