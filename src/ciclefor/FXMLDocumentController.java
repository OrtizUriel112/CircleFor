/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclefor;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author URIEL
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Circle tie5;
    @FXML
    private Circle tie3;
    @FXML
    private Circle tie2;
    @FXML
    private Circle tie1;
    @FXML
    private Circle circle0;
    @FXML
    private TextArea textArea;
    @FXML
    private Button button1;
    @FXML
    private Circle circle1;
    @FXML
    private Circle circle2;
    @FXML
    private Circle circle3;
    @FXML
    private Circle circle4;
    @FXML
    private Circle circle5;
    @FXML
    private Circle circle6;
    @FXML
    private Circle circle7;
    @FXML
    private Circle circle8;
    @FXML
    private Circle circle9;
    @FXML
    private Circle circle10;
    @FXML
    private Circle circle19;
    @FXML
    private Circle circle11;
    @FXML
    private Circle tie4;
    @FXML
    private Circle circle12;
    @FXML
    private Circle circle13;
    @FXML
    private Circle circle14;
    @FXML
    private Circle circle15;
    @FXML
    private Circle circle16;
    @FXML
    private Circle circle17;
    @FXML
    private Circle circle18;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void eventButton1(ActionEvent event) {
        String texto = textArea.getText();
        String[] palabras = texto.split(" ");
        String status = "0";
        boolean option0 = false;
        boolean option1 = false;
        boolean option2 = false;
        boolean option3 = false;
        boolean option4 = false;
        boolean option5 = false;
        boolean option6 = false;
        boolean option7 = false;
        boolean option8 = false;
        boolean option9 = false;
        boolean option10 = false;
        boolean option11 = false;
        boolean option12 = false;
        boolean option13 = false;
        boolean option14 = false;
        boolean option15 = false;
        boolean option16 = false;
        boolean option17 = false;
        boolean option18 = false;
        boolean option19 = false;

        boolean optionRed0 = true;
        boolean optionRed1 = true;
        boolean optionRed2 = true;
        boolean optionRed3 = true;
        boolean optionRed4 = true;
        boolean optionRed5 = true;
        boolean optionRed6 = true;
        boolean optionRed7 = true;
        boolean optionRed8 = true;
        boolean optionRed9 = true;
        boolean optionRed10 = true;
        boolean optionRed11 = true;
        boolean optionRed12 = true;
        boolean optionRed13 = true;
        boolean optionRed14 = true;
        boolean optionRed15 = true;
        boolean optionRed16 = true;
        boolean optionRed17 = true;
        boolean optionRed18 = true;
        boolean optionRed19 = true;
        
        for(int i=0; i<palabras.length;i++){
            System.out.print(palabras[i]+" ");
        }
        
        circle0.setFill(javafx.scene.paint.Color.GRAY);
        circle1.setFill(javafx.scene.paint.Color.GRAY);
        circle2.setFill(javafx.scene.paint.Color.GRAY);
        circle3.setFill(javafx.scene.paint.Color.GRAY);
        circle4.setFill(javafx.scene.paint.Color.GRAY);
        circle5.setFill(javafx.scene.paint.Color.GRAY);
        circle6.setFill(javafx.scene.paint.Color.GRAY);
        circle7.setFill(javafx.scene.paint.Color.GRAY);
        circle8.setFill(javafx.scene.paint.Color.GRAY);
        circle9.setFill(javafx.scene.paint.Color.GRAY);
        circle10.setFill(javafx.scene.paint.Color.GRAY);
        circle11.setFill(javafx.scene.paint.Color.GRAY);
        circle12.setFill(javafx.scene.paint.Color.GRAY);
        circle13.setFill(javafx.scene.paint.Color.GRAY);
        circle14.setFill(javafx.scene.paint.Color.GRAY);
        circle15.setFill(javafx.scene.paint.Color.GRAY);
        circle16.setFill(javafx.scene.paint.Color.GRAY);
        circle17.setFill(javafx.scene.paint.Color.GRAY);
        circle18.setFill(javafx.scene.paint.Color.GRAY);
        circle19.setFill(javafx.scene.paint.Color.GRAY);
        tie1.setFill(javafx.scene.paint.Color.WHITE);
        tie2.setFill(javafx.scene.paint.Color.WHITE);
        tie3.setFill(javafx.scene.paint.Color.WHITE);
        tie4.setFill(javafx.scene.paint.Color.WHITE);
        tie5.setFill(javafx.scene.paint.Color.WHITE);
       
        
        
        try {
            System.out.println(" ");
            for(int i=0;i<palabras.length;i++){
                Pattern wIdentificador = Pattern.compile("[a-zA-Z]+");
                Matcher wIdentificador2 = wIdentificador.matcher(palabras[i]);
                Pattern valorIdent = Pattern.compile("[0-9]+");
                Matcher valorIdent2 = valorIdent.matcher(palabras[i]);
                Pattern valorIdentMore = Pattern.compile("[0-9]+");
                Matcher valorIdentMore2 = valorIdentMore.matcher(palabras[i]);
                Pattern valorNegativeIdent = Pattern.compile("(-)*[0-9]+");
                Matcher valorNegativeIdent2 = valorNegativeIdent.matcher(palabras[i]);
                Pattern valorCompare = Pattern.compile("[<|>](=)*|(!|=)(=)");
                Matcher valorCompare2 = valorCompare.matcher(palabras[i]);
                if(palabras[i].equals("for") && option0 == false && status.equals("0")){
                    circle0.setFill(javafx.scene.paint.Color.GREEN);
                    circle1.setFill(javafx.scene.paint.Color.GREEN);
                    option0=true;
                    optionRed0=false;
                    status = "1";
                }else if(palabras[i].equals("(") && option1 == false && status.equals("1")){
                    circle2.setFill(javafx.scene.paint.Color.GREEN);
                    option1 = true;
                    optionRed1 = false;
                    status = "2";
                }else if(palabras[i].equals("int") && option2 == false && status.equals("2")){
                    circle3.setFill(javafx.scene.paint.Color.GREEN);
                    option2 = true;
                    optionRed2 = false;
                    status = "3";
                }else if(wIdentificador2.matches() && option3 == false && status.equals("3")){
                    circle4.setFill(javafx.scene.paint.Color.GREEN);
                    if(palabras[i].length()>1){
                        tie1.setFill(javafx.scene.paint.Color.LIGHTGREEN);
                    }
                    option3 = true;
                    optionRed3 = false;
                    status = "4";
                }else if(palabras[i].equals("=") && option4 == false && status.equals("4")){
                    circle5.setFill(javafx.scene.paint.Color.GREEN);
                    option4 = true;
                    optionRed4 = false;
                    status = "5";
                }else if(valorIdent2.matches() && option5 == false && status.equals("5")){
                    circle6.setFill(javafx.scene.paint.Color.GREEN);
                    if(palabras[i].length()>1){
                        tie5.setFill(javafx.scene.paint.Color.LIGHTGREEN);
                    }
                    option5 = true;
                    optionRed5 = false;
                    status = "6";
                }else if(palabras[i].equals(";") && option6 == false && status.equals("6")){
                    circle7.setFill(javafx.scene.paint.Color.GREEN);
                    option6 = true;
                    optionRed6 = false;
                    status = "7";
                }else if(wIdentificador2.matches() && option7 == false && status.equals("7")){
                    circle8.setFill(javafx.scene.paint.Color.GREEN);
                    if(palabras[i].length()>1){
                        tie2.setFill(javafx.scene.paint.Color.LIGHTGREEN);
                    }
                    option7 = true;
                    optionRed7 = false;
                    status = "8";
                }else if(valorCompare2.matches() && option8 == false && status.equals("8")){
                    circle9.setFill(javafx.scene.paint.Color.GREEN);
                    option8 = true;
                    optionRed8 = false;
                    status = "9";
                }else if(valorIdentMore2.matches() && option9 == false && status.equals("9")){
                    circle10.setFill(javafx.scene.paint.Color.GREEN);
                    if(palabras[i].length()>1){
                        tie3.setFill(javafx.scene.paint.Color.LIGHTGREEN);
                    }
                    option9 = true;
                    optionRed9 = false;
                    status = "10";
                }else if(valorNegativeIdent2.matches() && option9 == false && status.equals("9")){
                    circle19.setFill(javafx.scene.paint.Color.GREEN);
                    circle10.setFill(javafx.scene.paint.Color.GREEN);
                    if(palabras[i].length()>2){
                        tie3.setFill(javafx.scene.paint.Color.LIGHTGREEN);
                    }
                    option9 = true;
                    optionRed9 = false;
                    status = "10";
                }else if(palabras[i].equals(";") && option10 == false && status.equals("10")){
                    circle11.setFill(javafx.scene.paint.Color.GREEN);
                    option10 = true;
                    optionRed10 = false;
                    status = "11";
                }else if(wIdentificador2.matches() && option11 == false && status.equals("11")){
                    circle12.setFill(javafx.scene.paint.Color.GREEN);
                    if(palabras[i].length()>1){
                        tie4.setFill(javafx.scene.paint.Color.LIGHTGREEN);
                    }
                    option11 = true;
                    optionRed11 = false;
                    status = "12";
                }else if((palabras[i].equals("++") || palabras[i].equals("--")) && option12 == false && status.equals("12")){
                    circle13.setFill(javafx.scene.paint.Color.GREEN);
                    option12 = true;
                    optionRed12 = false;
                    status = "13";
                }else if(palabras[i].equals(")") && option13 == false && status.equals("13")){
                    circle14.setFill(javafx.scene.paint.Color.GREEN);
                    option13 = true;
                    optionRed13 = false;
                    status = "14";
                }else if(palabras[i].equals("{") && option14 == false && status.equals("14")){
                    circle15.setFill(javafx.scene.paint.Color.GREEN);
                    option14 = true;
                    optionRed14 = false;
                    status = "15";
                }else if(palabras[i].equals("instrucciones") && option15 == false && status.equals("15")){
                    circle16.setFill(javafx.scene.paint.Color.GREEN);
                    option15 = true;
                    optionRed15 = false;
                    status = "16";
                }else if(palabras[i].equals(";") && option16 == false && status.equals("16")){
                    circle17.setFill(javafx.scene.paint.Color.GREEN);
                    option16 = true;
                    optionRed16 = false;
                    status = "17";
                }else if(palabras[i].equals("}") && option17 == false && status.equals("17")){
                    circle18.setFill(javafx.scene.paint.Color.GREEN);
                    option17 = true;
                    optionRed17 = false;
                    status = "18";
                }else if(palabras[i].equals(";") && option2 == false && status.equals("2")){
                    circle7.setFill(javafx.scene.paint.Color.GREEN);
                    option2 = true;
                    option3 = true;
                    option4 = true;
                    option5 = true;
                    option6 = true;
                    optionRed2 = false;
                    optionRed3 = false;
                    optionRed4 = false;
                    optionRed5 = false;
                    optionRed6 = false;
                    status = "7";
                }else if(palabras[i].equals(")") && option11 == false && status.equals("11")){
                    circle14.setFill(javafx.scene.paint.Color.GREEN);
                    option12 = true;
                    option13 = true;
                    optionRed12 = false;
                    optionRed13 = false;
                    status = "14";
                }else if(palabras[i].equals(";") && option7 == false && status.equals("7")){
                    circle11.setFill(javafx.scene.paint.Color.GREEN);
                    option8 = true;
                    option9 = true;
                    option10 = true;
                    option19 = true;
                    optionRed8 = false;
                    optionRed9 = false;
                    optionRed10 = false;
                    optionRed19 = false;
                    status = "11";
                }else{
                    if(optionRed0==true){
                    circle0.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed1==true){
                    circle1.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed2==true){
                    circle2.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed3==true){
                    circle3.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed4==true){
                    circle4.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed5==true){
                    circle5.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed6==true){
                    circle6.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed7==true){
                    circle7.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed8==true){
                    circle8.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed9==true){
                    circle9.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed10==true){
                    circle10.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed11==true){
                    circle11.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed12==true){
                    circle12.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed13==true){
                    circle13.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed14==true){
                    circle14.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed15==true){
                    circle15.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed16==true){
                    circle16.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed17==true){
                    circle17.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed18==true){
                    circle18.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }else if(optionRed19==true){
                    circle19.setFill(javafx.scene.paint.Color.RED);
                    break;
                    }
                }
                
                
            }
        } catch (Exception e) {
        }
    }
    
}
