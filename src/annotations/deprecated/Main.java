package annotations.deprecated;
public class Main {
    public static void main(String[] args){
        LegacyAPI api = new LegacyAPI();
        api.oldMethod();
        api.newMethod();
    }
}
