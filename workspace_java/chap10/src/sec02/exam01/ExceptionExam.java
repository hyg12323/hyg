package sec02.exam01;

public class ExceptionExam {

    public static void main(String[] args) {
        System.out.println(" 재원: 딸랑딸랑 ");
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + ":" + args[i]);
        }
        try {
            String name = "김";
            int a = Integer.parseInt(name);

            System.out.println(args[100]);
            System.out.println("1번자리");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("2번자리");
            e.printStackTrace();
//        } catch (Exception e) {
//
//            System.out.println("4번쨰자리");
//            e.printStackTrace();

        } catch (NumberFormatException nfe) {

            System.out.println("3번자리");
            nfe.printStackTrace();
        }
        System.out.println("하용군:yes master");
        
    }

}