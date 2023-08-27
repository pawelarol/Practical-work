package CrossPlatform;

public class WindowsDialog extends Dialog{

    public Button createButton(){
        return new WindowsButton();
    }
}
