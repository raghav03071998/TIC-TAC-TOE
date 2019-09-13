package sample;
import javafx.fxml.FXML;
import javafx.scene.control.*;
public class Controller {
    @FXML
    Button zero;
    @FXML
    Button one;
    @FXML
    Button two;
    @FXML
    Button three;
    @FXML
    Button four;
    @FXML
    Button five;
    @FXML
    Button six;
    @FXML
    Button seven;
    @FXML
    Button eight;
    int c=0;
    public void buttonpressed(javafx.event.ActionEvent event) {

        if(c%2==0 ) {
            if (event.getSource().equals(zero) && zero.getText().equals("")) {
                zero.setText("X");
                c++;
            } else if (event.getSource().equals(one) && one.getText().equals("")) {
                one.setText("X");
                c++;
            } else if (event.getSource().equals(two)&& two.getText().equals("")) {
                two.setText("X");
                c++;
            } else if (event.getSource().equals(three)&& three.getText().equals("")) {
                three.setText("X");
                c++;
            } else if (event.getSource().equals(four)&& four.getText().equals("")) {
                four.setText("X");
                c++;
            } else if (event.getSource().equals(five) && five.getText().equals("")) {
                c++;
                five.setText("X");
            } else if (event.getSource().equals(six) && six.getText().equals("")) {
                six.setText("X");
                c++;
            } else if (event.getSource().equals(seven) &&seven.getText().equals("")) {
                c++;
                seven.setText("X");
            } else if (event.getSource().equals(eight) && eight.getText().equals("")) {
                c++;
                eight.setText("X");
            }
        }
            else
            {
                if (event.getSource().equals(zero) && zero.getText().equals("")) {
                    zero.setText("0");
                    c++;
                    }
                else if(event.getSource().equals(one) && one.getText().equals(""))
                {
                    one.setText("0");
                    c++;
                }
                else if(event.getSource().equals(two) && two.getText().equals(""))
                {
                    two.setText("0");
                    c++;
                }
                else if(event.getSource().equals(three) && three.getText().equals(""))
                {
                    three.setText("0");
                    c++;
                }
                else if(event.getSource().equals(four) && four.getText().equals(""))
                {
                    four.setText("0");
                    c++;
                }
                else if(event.getSource().equals(five) && five.getText().equals(""))
                {
                    five.setText("0");
                    c++;
                }
                else if(event.getSource().equals(six) && six.getText().equals(""))
                {
                    six.setText("0");
                    c++;
                }
                else if (event.getSource().equals(seven) && seven.getText().equals(""))
                {
                    seven.setText("0");
                    c++;
                }
                else if(event.getSource().equals(eight) && eight.getText().equals(""))
                {
                    eight.setText("0");
                    c++;
                }
        }
        check();
    }
    public void check()
    {
        int w=0;

        if(zero.getText().equals("X") && one.getText().equals("X") && two.getText().equals("X") ||
                zero.getText().equals("X") && three.getText().equals("X") && six.getText().equals("X")||
                zero.getText().equals("X") && four.getText().equals("X") && eight.getText().equals("X")||
                three.getText().equals("X") && four.getText().equals("X") && five.getText().equals("X") ||
                one.getText().equals("X") && four.getText().equals("X") && seven.getText().equals("X")||
                two.getText().equals("X") && five.getText().equals("X") && eight.getText().equals("X")||
                six.getText().equals("X") && seven.getText().equals("X") && eight.getText().equals("X")||
                two.getText().equals("X") && four.getText().equals("X") && six.getText().equals("X"))
        {
            w=1;
            System.out.println("player one wins");
            ButtonType ok=new ButtonType("OK");
            Alert aw=new Alert(Alert.AlertType.NONE,"PLAYER ONE WINS",ok);
            aw.showAndWait();
            if(aw.getResult().equals(ok)) {
                choice();
            }
             }
        if(zero.getText().equals("0") && one.getText().equals("0") && two.getText().equals("0") ||
                zero.getText().equals("0") && three.getText().equals("0") && six.getText().equals("0")||
                zero.getText().equals("0") && four.getText().equals("0") && eight.getText().equals("0")||
                three.getText().equals("0") && four.getText().equals("0") && five.getText().equals("0") ||
                one.getText().equals("0") && four.getText().equals("0") && seven.getText().equals("0")||
                two.getText().equals("0") && five.getText().equals("0") && eight.getText().equals("0")||
                six.getText().equals("0") && seven.getText().equals("0") && eight.getText().equals("0")||
                two.getText().equals("0") && four.getText().equals("0") && six.getText().equals("0"))
        {
            w=1;
            System.out.println("player 2 wins");
            ButtonType ok=new ButtonType("OK");
            Alert aw=new Alert(Alert.AlertType.NONE,"PLAYER TWO WINS",ok);
            aw.showAndWait();
            if(aw.getResult().equals(ok))
            {
                choice();
            }
        }
        if(c==9 && w==0)
        {
            System.out.println("match drawn");
            ButtonType db=new ButtonType("ok");
            Alert al=new Alert(Alert.AlertType.NONE,"match drawn",db);
            al.showAndWait();
            if(al.getResult().equals(db))
            {
                choice();
            }
        }
    }
    public void close()
    {
        zero.setVisible(false);
        one.setVisible(false);
        two.setVisible(false);
        three.setVisible(false);
        four.setVisible(false);
        five.setVisible(false);
        six.setVisible(false);
        seven.setVisible(false);
        eight.setVisible(false);
    }
    public void choice()
    {
        ButtonType yes=new ButtonType("yes");
        ButtonType no=new ButtonType("no");
        Alert a=new Alert(Alert.AlertType.NONE,"Want to play again?",yes,no);
        a.showAndWait();
        if(a.getResult().equals(yes))
        {
            show();
            System.out.println("want to play again");
        }
        else
        {
            close();
            System.out.println("no dont want to play again");
        }
    }
    public void show()
    {
        c=0;
        zero.setText("");
        one.setText("");
        two.setText("");
        three.setText("");
        four.setText("");
        five.setText("");
        six.setText("");
        seven.setText("");
        eight.setText("");
        zero.setDisable(false);
        one.setDisable(false);
        two.setDisable(false);
        three.setDisable(false);
        four.setDisable(false);
        five.setDisable(false);
        six.setDisable(false);
        seven.setDisable(false);
        eight.setDisable(false);
    }
}
