package com.niangaoa.easychangesetting;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;

public class ECSController {
    public TextField tef1;
    public TextField tef2;
    public TextField tef4;
    public TextField tef3;
    public TextField tef6;
    public TextField tef5;
    public Text set2;
    public Text set3;
    public Text set4;
    public Text set5;
    public Text set7;
    public Text set6;
    public Text set8;
    public Text set9;
    public Text set10;
    public Text set11;
    public Text set12;
    public Text set1;

    JsonObject jsonObject = new JsonObject();

    @FXML
    public void onYes1() throws IOException {
        this.onSetTF("vsync", true);
        this.set1.setText("是");
    }

    @FXML
    public void onNo1() throws IOException {
        this.onSetTF("vsync", false);
        this.set1.setText("否");
    }

    @FXML
    public void onYes2() throws IOException {
        this.onSetTF("devMode", true);
        this.set3.setText("是");
    }

    @FXML
    public void onNo2() throws IOException {
        this.onSetTF("devMode", false);
        this.set3.setText("否");
    }

    @FXML
    public void onYes3() throws IOException {
        this.onSetTF("undecoratedWindow", true);
        this.set4.setText("是");
    }

    @FXML
    public void onNo3() throws IOException {
        this.onSetTF("undecoratedWindow", false);
        this.set4.setText("否");
    }

    @FXML
    public void onYes4() throws IOException {
        this.onSetTF("alwaysUndecoratedAtFullscreen", true);
        this.set5.setText("是");
    }

    @FXML
    public void onNo4() throws IOException {
        this.onSetTF("alwaysUndecoratedAtFullscreen", false);
        this.set5.setText("否");
    }

    @FXML
    public void onYes5() throws IOException {
        this.onSetTF("allowAnyJavaVersion", true);
        this.set6.setText("是");
    }

    @FXML
    public void onNo5() throws IOException {
        this.onSetTF("allowAnyJavaVersion", false);
        this.set6.setText("否");
    }

    @FXML
    public void onYes6() throws IOException {
        this.onSetTF("altMouseMoveToMassTransfer", true);
        this.set7.setText("是");
    }

    @FXML
    public void onNo6() throws IOException {
        this.onSetTF("altMouseMoveToMassTransfer", false);
        this.set7.setText("否");
    }

    @FXML
    public void onEss1() throws IOException {
        if (tef1.getText().length() >= 4) {
            tef1.setText("设置这么高fps我捶你");
        }
        else {
            this.onSetValue("fps", tef1);
            this.set2.setText(tef1.getText());
        }
    }

    @FXML
    public void onEss2() throws IOException {
        if (tef2.getText().length() >= 5) {
            tef2.setText("不要设置那么高哥哥");
        }
        else {
            this.onSetValue("maxBattleSize", tef2);
            this.set8.setText(tef2.getText());
        }
    }

    @FXML
    public void onEss3() throws IOException {
        if (Integer.parseInt(tef3.getText()) >= 110) {
            tef3.setText("你想成为全宇宙经验最多的？");
        }
        else {
            this.onSetValue("playerMaxLevel", tef3);
            this.set9.setText(tef3.getText());
        }
    }

    @FXML
    public void onEss4() throws IOException {
        if (Integer.parseInt(tef4.getText()) >= 100) {
            tef4.setText("你想建立国家吗这么多船");
        }
        else {
            this.onSetValue("maxShipsInFleet", tef4);
            this.set10.setText(tef4.getText());
        }
    }

    @FXML
    public void onEss5() throws IOException {
        if (Integer.parseInt(tef5.getText()) >= 50) {
            tef5.setText("这个宇宙有这么混乱吗?");
        }
        else {
            this.onSetValue("minPersonBounties", tef5);
            this.set11.setText(tef5.getText());
        }
    }

    @FXML
    public void onEss6() throws IOException {
        if (Integer.parseInt(tef6.getText()) >= 60) {
            tef6.setText("你不怕电脑炸吗？");
        }
        else {
            this.onSetValue("maxPersonBounties", tef6);
            this.set12.setText(tef6.getText());
        }
    }

    @FXML
    public void onRe1() throws IOException {
        this.onSetTF("vsync", true);
        this.set1.setText("是");
    }

    @FXML
    public void onRe2() throws IOException {
        this.onSetTF("fps", 60);
        this.set2.setText("60");
    }

    @FXML
    public void onRe3() throws IOException {
        this.onSetTF("devMode", false);
        this.set3.setText("否");
    }

    @FXML
    public void onRe4() throws IOException {
        this.onSetTF("undecoratedWindow", false);
        this.set4.setText("否");
    }

    @FXML
    public void onRe5() throws IOException {
        this.onSetTF("alwaysUndecoratedAtFullscreen", true);
        this.set5.setText("是");
    }

    @FXML
    public void onRe6() throws IOException {
        this.onSetTF("allowAnyJavaVersion", false);
        this.set6.setText("否");
    }

    @FXML
    public void onRe7() throws IOException {
        this.onSetTF("altMouseMoveToMassTransfer", false);
        this.set7.setText("否");
    }

    @FXML
    public void onRe8() throws IOException {
        this.onSetTF("maxBattleSize", 500);
        this.set8.setText("500");
    }

    @FXML
    public void onRe9() throws IOException {
        this.onSetTF("playerMaxLevel", 50);
        this.set9.setText("50");
    }

    @FXML
    public void onRe10() throws IOException {
        this.onSetTF("maxShipsInFleet", 30);
        this.set10.setText("30");
    }

    @FXML
    public void onRe11() throws IOException {
        this.onSetTF("minPersonBounties", 3);
        this.set11.setText("3");
    }

    @FXML
    public void onRe12() throws IOException {
        this.onSetTF("maxPersonBounties", 5);
        this.set12.setText("5");
    }

    public void onSetTF(String name, Boolean tf) throws IOException {
        jsonObject.addProperty(name, tf);
        File file = new File("data/config/settings.json");
        FileOutputStream out1 = new FileOutputStream(file);
        OutputStreamWriter writer1 = new OutputStreamWriter(out1, StandardCharsets.UTF_8);
        writer1.append(jsonObject.toString());
        writer1.close();
        out1.close();
        this.write();
    }
    public void onSetTF(String name, int tf) throws IOException {
        jsonObject.addProperty(name, tf);
        File file = new File("data/config/settings.json");
        FileOutputStream out1 = new FileOutputStream(file);
        OutputStreamWriter writer1 = new OutputStreamWriter(out1, StandardCharsets.UTF_8);
        writer1.append(jsonObject.toString());
        writer1.close();
        out1.close();
        this.write();
    }

    public void onSetValue(String name, TextField tefg) throws IOException {
        try {
            Integer value = Integer.valueOf(tefg.getText());
            jsonObject.addProperty(name, value);
            File file = new File("data/config/settings.json");
            FileOutputStream out1 = new FileOutputStream(file);
            OutputStreamWriter writer1 = new OutputStreamWriter(out1, StandardCharsets.UTF_8);
            writer1.append(jsonObject.toString());
            writer1.close();
            out1.close();
            this.write();
        }
        catch (InputMismatchException | IOException e) {
            tefg.setText("请输入数字qwq");
            throw e;
        }
    }
    JsonObject jsonObject1 = (JsonObject) JsonParser.parseReader(new FileReader("data/config/settings.json"));

    public ECSController() throws FileNotFoundException {
        jsonObject.addProperty("vsync", jsonObject1.get("vsync").getAsBoolean());
        jsonObject.addProperty("devMode", jsonObject1.get("devMode").getAsBoolean());
        jsonObject.addProperty("undecoratedWindow", jsonObject1.get("undecoratedWindow").getAsBoolean());
        jsonObject.addProperty("alwaysUndecoratedAtFullscreen", jsonObject1.get("alwaysUndecoratedAtFullscreen").getAsBoolean());
        jsonObject.addProperty("allowAnyJavaVersion", jsonObject1.get("allowAnyJavaVersion").getAsBoolean());
        jsonObject.addProperty("altMouseMoveToMassTransfer", jsonObject1.get("altMouseMoveToMassTransfer").getAsBoolean());
        jsonObject.addProperty("fps", jsonObject1.get("fps").getAsInt());
        jsonObject.addProperty("maxBattleSize", jsonObject1.get("maxBattleSize").getAsInt());
        jsonObject.addProperty("playerMaxLevel", jsonObject1.get("playerMaxLevel").getAsInt());
        jsonObject.addProperty("maxShipsInFleet", jsonObject1.get("maxShipsInFleet").getAsInt());
        jsonObject.addProperty("minPersonBounties", jsonObject1.get("minPersonBounties").getAsInt());
        jsonObject.addProperty("maxPersonBounties", jsonObject1.get("maxPersonBounties").getAsInt());
    }

    public void write() throws IOException {
        File file = new File("data/config/settings.json");
        FileOutputStream out1 = new FileOutputStream(file);
        OutputStreamWriter writer1 = new OutputStreamWriter(out1, StandardCharsets.UTF_8);
        writer1.append(jsonObject.toString());
        writer1.close();
        out1.close();
    }
}