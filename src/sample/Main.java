package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {
    private HBox labelHBox, root1Hbox, root2Hbox, root3Hbox,root4Hbox, root5Hbox;
    private VBox root;
    private Label label;
    private Button clearBtn, sqrtBtn, powerBtn, equalBtn, dotBtn, plusBtn, divideBtn, minusBtn, multiplyBtn,
            nothingBtn, oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn,
            nineBtn, zeroBtn;

    @Override
    public void start(Stage primaryStage) throws Exception{
        label= new Label("0");
        labelHBox= new HBox(15, label);
        label.setFont(new Font(36));
        labelHBox.setAlignment(Pos.BOTTOM_RIGHT);

        //root1 implement there
        clearBtn= new Button("C");
        clearBtn.setPrefWidth(120);
        clearBtn.setPrefHeight(60);
        powerBtn= new Button("x^2");
        powerBtn.setPrefHeight(60);
        powerBtn.setPrefWidth(120);
        sqrtBtn= new Button("Sqrt");
        sqrtBtn.setPrefWidth(120);
        sqrtBtn.setPrefHeight(60);
        divideBtn= new Button("/");
        divideBtn.setPrefWidth(120);
        divideBtn.setPrefHeight(60);


        //root2 implement there
        sevenBtn= new Button("7");
        sevenBtn.setPrefHeight(60);
        sevenBtn.setPrefWidth(120);
        eightBtn = new Button("8");
        eightBtn.setPrefWidth(120);
        eightBtn.setPrefHeight(60);
        nineBtn = new Button("9");
        nineBtn.setPrefHeight(60);
        nineBtn.setPrefWidth(120);
        multiplyBtn = new Button("x");
        multiplyBtn.setPrefWidth(120);
        multiplyBtn.setPrefHeight(60);


        //root3 implement there
        fourBtn = new Button("4");
        fourBtn.setPrefHeight(60);
        fourBtn.setPrefWidth(120);
        fiveBtn= new Button("5");
        fiveBtn.setPrefHeight(60);
        fiveBtn.setPrefWidth(120);
        sixBtn= new Button("6");
        sixBtn.setPrefHeight(60);
        sixBtn.setPrefWidth(120);
        minusBtn= new Button("-");
        minusBtn.setPrefHeight(60);
        minusBtn.setPrefWidth(120);



        //root4 implement there
        oneBtn= new Button("1");
        oneBtn.setPrefHeight(60);
        oneBtn.setPrefWidth(120);
        twoBtn= new Button("2");
        twoBtn.setPrefHeight(60);
        twoBtn.setPrefWidth(120);
        threeBtn= new Button("3");
        threeBtn.setPrefHeight(60);
        threeBtn.setPrefWidth(120);
        plusBtn= new Button("+");
        plusBtn.setPrefHeight(60);
        plusBtn.setPrefWidth(120);


        nothingBtn=new Button("+/-");
        nothingBtn.setPrefHeight(60);
        nothingBtn.setPrefWidth(120);
        zeroBtn= new Button("0");
        zeroBtn.setPrefHeight(60);
        zeroBtn.setPrefWidth(120);
        dotBtn= new Button(".");
        dotBtn.setPrefHeight(60);
        dotBtn.setPrefWidth(120);
        equalBtn=new Button("=");
        equalBtn.setPrefHeight(60);
        equalBtn.setPrefWidth(120);


        root1Hbox= new HBox(clearBtn , powerBtn , sqrtBtn , divideBtn);
        root1Hbox.setAlignment(Pos.BOTTOM_CENTER);

        root2Hbox= new HBox(sevenBtn , eightBtn , nineBtn , multiplyBtn);
        root2Hbox.setAlignment(Pos.BOTTOM_CENTER);

        root3Hbox= new HBox(fourBtn , fiveBtn , sixBtn , minusBtn);
        root3Hbox.setAlignment(Pos.BOTTOM_CENTER);

        root4Hbox= new HBox(oneBtn,twoBtn,threeBtn , plusBtn);
        root4Hbox.setAlignment(Pos.BOTTOM_CENTER);

        root5Hbox= new HBox(nothingBtn , zeroBtn , dotBtn,equalBtn);
        root5Hbox.setAlignment(Pos.BOTTOM_CENTER);



        //eventHandler oon buttons
        getValue setValue = new getValue();
        oneBtn.setOnAction(setValue);
        twoBtn.setOnAction(setValue);
        threeBtn.setOnAction(setValue);
        fourBtn.setOnAction(setValue);
        fiveBtn.setOnAction(setValue);
        sixBtn.setOnAction(setValue);
        sevenBtn.setOnAction(setValue);
        eightBtn.setOnAction(setValue);
        nineBtn.setOnAction(setValue);
        zeroBtn.setOnAction(setValue);

        //event operations
        action act = new action();
        divideBtn.setOnAction(act);
        clearBtn.setOnAction(act);
        sqrtBtn.setOnAction(act);
        powerBtn.setOnAction(act);
        equalBtn.setOnAction(act);
        multiplyBtn.setOnAction(act);
        minusBtn.setOnAction(act);
        plusBtn.setOnAction(act);

        //root add all
        root= new VBox(labelHBox, root1Hbox , root2Hbox , root3Hbox , root4Hbox , root5Hbox);
        Scene scene = new Scene(root, 400 , 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator-181380027");
        primaryStage.show();

    }


    private  class  getValue implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            if(event.getSource() == sevenBtn){
                label.setText("7");
            }
            else if(event.getSource() == eightBtn){
                label.setText("8");
            }
            if(event.getSource() == nineBtn){
                label.setText("9");
            }
            else if(event.getSource() == fourBtn){
                label.setText("4");
            }
            if(event.getSource() == fiveBtn){
                label.setText("5");
            }
            else  if(event.getSource() == sixBtn){
                label.setText("6");
            }
            if(event.getSource() == oneBtn){
                label.setText("1");
            }
            else  if(event.getSource() == twoBtn){
                label.setText("2");
            }
            if(event.getSource() == threeBtn){
                label.setText("3");
            }
            else  if(event.getSource() == zeroBtn){
                label.setText("0");
            }
        }
    }


    //action event Handler
    public class action implements EventHandler<ActionEvent>{
        double  value, number;
        String string;

        @Override
        public void handle(ActionEvent event) {
            if(event.getSource() == clearBtn){
                label.setText("0");
            }
            else if(event.getSource() == powerBtn){
                value= getDouble(label);
                value = Math.pow(value,2);
                label.setText(value+"");
            }
            else  if(event.getSource() == sqrtBtn){
                value = getDouble(label);
                System.out.println(value);
                value = Math.sqrt(value);
                label.setText(value+"");
            }

            else  if(event.getSource() == divideBtn){
                value = getDouble(label);
                label.setText(null);
                string = "divide";
            }
            else  if(event.getSource() == multiplyBtn){
                value = getDouble(label);
                label.setText(null);
                string = "multiply";
            }
            else  if(event.getSource() == minusBtn){
                value = getDouble(label);
                label.setText(null);
                string = "minus";
            }
            else if(event.getSource() == plusBtn){
                value = getDouble(label);
                label.setText(null);
                string = "plus";
            }

            else if(event.getSource() == equalBtn){
                if(string.equals("divide")){
                    number=getDouble(label);
                    String numb = value / number+ "";
                    if(numb.equalsIgnoreCase("Infinity")){
                        label.setText("Error");
                    }
                    else {
                        label.setText(setLabel(value / number));
                    }
                }
                else if(string.equals("multiply")){
                    number=getDouble(label);
                    label.setText(setLabel(value * number));

                }
                else if(string.equals("minus")){
                    number=getDouble(label);
                    label.setText(setLabel(value - number));
                }
                else if(string.equals("plus")){
                    number=getDouble(label);
                    label.setText(setLabel(value + number));
                }
            }





        }
    }
    public  double getDouble(Label label){
        return Double.parseDouble(label.getText().toString());
    }

    public String setLabel(double value)
    {
        return  value+"";
    }



    public static void main(String[] args) {
        launch(args);
    }
}4