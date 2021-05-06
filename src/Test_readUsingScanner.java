import java.io.IOException;

public class Test_readUsingScanner {
    public static void main(String[] args) throws IOException {
        Main ava  = new Main();
        String result = ava.readUsingScanner("./info");
        Boolean readCheck;
        System.out.println(result);
        if (result == "Ржавый Печь Добросердечный Возвращение родину Товарный вагон Поздно бежать синий"){
            readCheck = true;
            System.out.println(readCheck);
        }else{
            readCheck = false;
            System.out.println(readCheck);
        }
    }
}
