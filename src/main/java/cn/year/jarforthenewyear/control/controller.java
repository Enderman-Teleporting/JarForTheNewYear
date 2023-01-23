package cn.year.jarforthenewyear.control;

import cn.year.jarforthenewyear.Delay;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.util.Calendar;

public class controller{
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
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            ft2.setDuration(Duration.seconds(3));
            ft2.setFromValue(1);
            ft2.setToValue(0);
            ft2.setNode(anchorPane);
            ft2.play();
        });
        return ft2;
    }/*
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
        Calendar calendar=Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR)-1;
        int year_now=calendar.get(Calendar.YEAR);
        Scene1Text.setText("随着时钟的指针");
        FadeTransition ft = new FadeTransition(Duration.seconds(3.0));
        FadeTransition ft2= new FadeTransition(Duration.seconds(3.0));
        ft.setFromValue(1);
        ft.setToValue(0);
        ft.setNode(Scene1);
        ft.play();
        ft.setOnFinished(e->{
            Delay.delayRunInUIThread(new Runnable() {
                @Override
                public void run() {

                }
            }, 3000);
            ft2.setDuration(Duration.seconds(3));
            ft2.setFromValue(0);
            ft2.setToValue(1);
            ft2.setNode(Scene1);
            ft2.play();
            ft2.setOnFinished(ex->{
                FadeTransition ftI = new FadeTransition();
                FadeTransition ft2I= new FadeTransition();
                Scene2Text.setText(year+"及其留下的遗憾迎来了终章");
                ftI.setDuration(Duration.seconds(3));
                ftI.setFromValue(1);
                ftI.setToValue(0);
                ftI.setNode(Scene2);
                ftI.play();
                ftI.setOnFinished(exe->{
                    Delay.delayRunInUIThread(new Runnable() {
                                                 @Override
                                                 public void run() {

                                                 }
                                             },3000);
                            ft2I.setDuration(Duration.seconds(3));
                    ft2I.setFromValue(0);
                    ft2I.setToValue(1);
                    ft2I.setNode(Scene2);
                    ft2I.play();
                    ft2I.setOnFinished(exec->{
                        Scene3Text.setText("而升起的 是"+year_now+"黎明希望与欢愉的太阳");
                        FadeTransition ftII = new FadeTransition();
                        FadeTransition ft2II= new FadeTransition();
                        ftII.setDuration(Duration.seconds(3));
                        ftII.setFromValue(1);
                        ftII.setToValue(0);
                        ftII.setNode(Scene3);
                        ftII.play();
                        ftII.setOnFinished(execu->{
                            Delay.delayRunInUIThread(new Runnable() {
                                @Override
                                public void run() {

                                }
                            },3000);
                            ft2II.setDuration(Duration.seconds(3.0));
                            ft2II.setFromValue(0);
                            ft2II.setToValue(1);
                            ft2II.setNode(Scene3);
                            ft2II.play();
                            ft2II.setOnFinished(executi->{
                                Scene4Text.setText("新年快乐!");
                                FadeTransition ftIII = new FadeTransition();
                                FadeTransition ft2III= new FadeTransition();
                                ftIII.setDuration(Duration.seconds(3));
                                ftIII.setFromValue(1);
                                ftIII.setToValue(0);
                                ftIII.setNode(Scene4);
                                ftIII.play();
                            });
                        });
                    });
                });
            });
        });
    }

}