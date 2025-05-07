package annotations.deprecated;

public class LegacyAPI {

    @Deprecated
    public void oldMethod(){
        System.out.println("This is the old feature. Please avoid using it.");
    }
    public void newMethod(){
        System.out.println("This is the new and improved feature.");
    }
}
