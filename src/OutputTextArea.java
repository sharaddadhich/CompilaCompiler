import theme.Theme;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import java.awt.*;

public class OutputTextArea extends JTextPane
{
    public OutputTextArea()
    {
        super();
        setFont(Theme.FONT_DEFAULT);
        setEditable(false);
    }

    public void appendText(String text)
    {
        appendText(text, Theme.FONT_INPUT_COLOR);
    }

    public void appendText(String text, Color color)
    {
        setText(getText()+text);
    }

}
