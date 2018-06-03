package com.example.administrator.myp2p.bean;

import java.util.List;

public class Index {

    /**
     * imageArr : [{"ID":"1","IMAPAURL":"http://gwop.xtrich.com/xtApp/lexianghuo1.html","IMAURL":"http://192.168.56.1:8080/P2PInvest/images/index01.jpg"},{"ID":"2","IMAPAURL":"http://gwop.xtrich.com/xtApp/new-plan.html","IMAURL":"http://192.168.56.1:8080/P2PInvest/images/index02.jpg"},{"ID":"3","IMAPAURL":"http://gwop.xtrich.com/xtApp/new-plan.html","IMAURL":"http://192.168.56.1:8080/P2PInvest/images/index03.jpg"},{"ID":"5","IMAPAURL":"http://gwop.xtrich.com/xtApp/twcx.html","IMAURL":"http://192.168.56.1:8080/P2PInvest/images/index05.jpg"}]
     * proInfo : {"id":"1","memberNum":"100","minTouMoney":"100","money":"10","name":"超级新手计划","progress":"90","suodingDays":"30","yearLv":"8.00"}
     */

    private ProInfoBean proInfo;
    private List<ImageArrBean> imageArr;

    public ProInfoBean getProInfo() {
        return proInfo;
    }

    public void setProInfo(ProInfoBean proInfo) {
        this.proInfo = proInfo;
    }

    public List<ImageArrBean> getImageArr() {
        return imageArr;
    }

    public void setImageArr(List<ImageArrBean> imageArr) {
        this.imageArr = imageArr;
    }

    public static class ProInfoBean {
        /**
         * id : 1
         * memberNum : 100
         * minTouMoney : 100
         * money : 10
         * name : 超级新手计划
         * progress : 90
         * suodingDays : 30
         * yearLv : 8.00
         */

        private String id;
        private String memberNum;
        private String minTouMoney;
        private String money;
        private String name;
        private String progress;
        private String suodingDays;
        private String yearLv;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getMemberNum() {
            return memberNum;
        }

        public void setMemberNum(String memberNum) {
            this.memberNum = memberNum;
        }

        public String getMinTouMoney() {
            return minTouMoney;
        }

        public void setMinTouMoney(String minTouMoney) {
            this.minTouMoney = minTouMoney;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProgress() {
            return progress;
        }

        public void setProgress(String progress) {
            this.progress = progress;
        }

        public String getSuodingDays() {
            return suodingDays;
        }

        public void setSuodingDays(String suodingDays) {
            this.suodingDays = suodingDays;
        }

        public String getYearLv() {
            return yearLv;
        }

        public void setYearLv(String yearLv) {
            this.yearLv = yearLv;
        }
    }

    public static class ImageArrBean {
        /**
         * ID : 1
         * IMAPAURL : http://gwop.xtrich.com/xtApp/lexianghuo1.html
         * IMAURL : http://192.168.56.1:8080/P2PInvest/images/index01.jpg
         */

        private String ID;
        private String IMAPAURL;
        private String IMAURL;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getIMAPAURL() {
            return IMAPAURL;
        }

        public void setIMAPAURL(String IMAPAURL) {
            this.IMAPAURL = IMAPAURL;
        }

        public String getIMAURL() {
            return IMAURL;
        }

        public void setIMAURL(String IMAURL) {
            this.IMAURL = IMAURL;
        }
    }
}
