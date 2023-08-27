package CrossPlatform;

import javax.swing.*;

public class HTMLButton implements Button{
    String name = "urlHTML";

    @Override
    public void render() {
           String buttonText = "Click me";
           String buttonColor = "007bff";
           String buttonHtml = generateButtonHtml(buttonText,buttonColor);

           System.out.println(buttonHtml);
        }

        private String generateButtonHtml(String buttonText, String buttonColor) {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<button style=\"background-color:").append(buttonColor).append(";\">")
                .append(buttonText)
                .append("</button>");
        return htmlBuilder.toString();

    }

    @Override
    public JButton onClick() {
        System.out.println("Button clicked!");
        return null;
    }
}
