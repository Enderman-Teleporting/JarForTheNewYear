package cn.year.jarforthenewyear.control;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.util.Calendar;

public class controller{
    @FXML
    private Button button;

    @FXML
    private AnchorPane Scene1;

    @FXML
    private AnchorPane Scene2;

    @FXML
    private AnchorPane Scene3;

    @FXML
    private Label Scene1Text;

    @FXML
    private AnchorPane Scene4;

    @FXML
    private Label Scene4Text;

    @FXML
    private Label Scene3Text;

    @FXML
    private Label Scene2Text;
    /*public FadeTransition appear_and_disappear(AnchorPane anchorPane, String text, Label label){
        label.setText(text);
        FadeTransition ft = new FadeTransition();
        FadeTransition ft2= new FadeTransition();
        ft.setDuration(Duration.seconds(3));
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.setNode(anchorPane);
        ft.play();
        ft.setOnFinished(e->{
            Delay.delayRunInUIThread(new Runnable() {
                @Override
                public void run() {

                }
            },3000);
            ft2.setDuration(Duration.seconds(3));
            ft2.setFromValue(1);
            ft2.setToValue(0);
            ft2.setNode(anchorPane);
            ft2.play();
        });
        return ft2;
    }*/
    /*@FXML
    void ffe469(ActionEvent event) {
        Calendar calendar=Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR)-1;
        int year_now=calendar.get(Calendar.YEAR);
        Scene1.setVisible(false);
        Scene2.setVisible(false);
        Scene3.setVisible(false);
        Scene4.setVisible(false);
        FadeTransition ft0=appear_and_disappear(Scene1,"随着时钟的指针",Scene1Text);
        ft0.setOnFinished(e-> {
                FadeTransition ft1=appear_and_disappear(Scene2,year+"及其留下的遗憾迎来了终章",Scene2Text);
                ft1.setOnFinished(ex->{
                    FadeTransition ft2=appear_and_disappear(Scene3,"而升起的 是"+year_now+"黎明希望与欢愉的太阳",Scene3Text);
                    ft2.setOnFinished(exe->{
                        FadeTransition ft3 = new FadeTransition();
                        ft3.setDuration(Duration.seconds(3000));
                        ft3.setFromValue(0);
                        ft3.setToValue(1);
                        ft3.play();

                    });
                });
            });



    }*/


    @FXML
    void ffe469(ActionEvent event) {

    }

    @FXML
    void onAction(ActionEvent event) {
        Calendar calendar=Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR)-1;
        int year_now=calendar.get(Calendar.YEAR);
        button.setVisible(false);
        Scene1.setVisible(true);
        Scene1Text.setText("随着时钟的指针");
        Scene2Text.setText(year+"及其留下的遗憾迎来了终章");
        Scene3Text.setText("而升起的 是"+year_now+"黎明希望与欢愉的太阳");
        Scene4Text.setText("新年快乐!");
        FadeTransition ft=new FadeTransition(Duration.seconds(3),Scene1);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.setOnFinished(e->{
            FadeTransition ft1=new FadeTransition(Duration.seconds(3),Scene1);
            ft1.setFromValue(1);
            ft1.setToValue(0);
            ft1.setOnFinished(ex->{
                Scene1.setVisible(false);
                Scene2.setVisible(true);
                FadeTransition ftI=new FadeTransition(Duration.seconds(3),Scene2);
                ftI.setFromValue(0);
                ftI.setToValue(1);
                ftI.setOnFinished(exe->{
                    FadeTransition ft1I=new FadeTransition(Duration.seconds(3),Scene2);
                    ft1I.setFromValue(1);
                    ft1I.setToValue(0);
                    ft1I.setOnFinished(exec->{
                        Scene2.setVisible(false);
                        Scene3.setVisible(true);
                        FadeTransition ftII=new FadeTransition(Duration.seconds(3),Scene3);
                        ftII.setFromValue(0);
                        ftII.setToValue(1);
                        ftII.setOnFinished(execu->{
                            FadeTransition ft1II=new FadeTransition(Duration.seconds(3),Scene3);
                            ft1II.setFromValue(1);
                            ft1II.setToValue(0);
                            ft1II.setOnFinished(execut->{
                                Scene3.setVisible(false);
                                Scene4.setVisible(true);
                                FadeTransition ftIII=new FadeTransition(Duration.seconds(3),Scene4);
                                ftIII.setFromValue(0);
                                ftIII.setToValue(1);
                                ftIII.play();
                            });
                            ft1II.play();
                        });
                        ftII.play();
                    });
                    ft1I.play();
                });
                ftI.play();
            });

            ft1.play();
        });
        ft.play();



    }

}