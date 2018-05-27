/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burger.app;

public class Hamburguer {

    private String meat;
    private String name;
    private int price;
    private String breadRollType;

    private String addition1name;
    private double addition1price;

    private String addition2name;
    private double addition2price;

    private String addition3name;
    private double addition3price;

    private String addition4name;
    private double addition4price;

    public Hamburguer(String meat, String name, int price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;

    }

    public void addition1(String addition1name, double addition1price) {
        this.addition1name = addition1name;
        this.addition1price = addition1price;
    }

    public void addition2(String addition2name, double addition2price) {
        this.addition2name = addition2name;
        this.addition2price = addition2price;
    }

    public void addition3(String addition3name, double addition3price) {
        this.addition3name = addition3name;
        this.addition3price = addition3price;
    }

    public void addition4(String addition4name, double addition4price) {
        this.addition4name = addition4name;
        this.addition4price = addition4price;
    }

    public double itemizeBurguer() {
        double hamburguerPrice = this.price;
        System.out.println(this.name + "hamburguer" + "with the breadroll " + this.breadRollType 
                + " with the meat type " + this.meat + " is " + this.price);
        
        if(this.addition1name !=null){
            hamburguerPrice +=this.addition1price;
            System.out.println(" Added "+this.addition1name + "for an extra "+this.addition1price);
        }
        
        if (this.addition2name !=null){
        hamburguerPrice +=this.addition2price;
        System.out.println(" Added "+this.addition2name + "for an extra "+this.addition2price);
    }
        
        if (this.addition3name !=null){
        hamburguerPrice +=this.addition3price;
        System.out.println(" Added "+this.addition3name + "for an extra "+this.addition3price);
        }
        if (this.addition4name !=null){
        hamburguerPrice +=this.addition4price;
        System.out.println(" Added "+this.addition4name + "for an extra "+this.addition4price);
    }
        return hamburguerPrice;
    }

}
