package com.gertis;

public class Main {

    public static void main(String[] args) {
        ITelephone evansPhone = new Deskphone(585944419);

        evansPhone.powerOn();
        evansPhone.callPhone(585944419);
        evansPhone.answer();

        evansPhone = new MobiePhone(234546);

        evansPhone.callPhone(234546);
        evansPhone.answer();

    }
}
