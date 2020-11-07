/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package joucykalkulator;

public class ProcessKalkulator { //class ModelKalkulator
    int operator=0; //Deklarasi variabel dimana operator = 0 dan bertipe data integer
    double number1, number2, number3, result; //Deklarasi variabel dimana number1, number2, number3 dan result bertipe data double
    String lprocess; //Deklarasi variabel dimana lproses bertipe karakter
    
    public void setNumber (String opr){ 
        if(!opr.equals("")){
            if(operator==0){
                number1=Double.valueOf(opr);
            }else{
                number2=Double.valueOf(opr);
            }
        }
    }
    public void setOperator(int operator){
        this.operator = operator;
    }
    public double getResult(){
        return result;
    }
    public void setResult(double hasil){
        this.result = hasil;
    }
    public void process(){
        switch (operator){ //Pernyataan dengan menggunakan switch, ekspresi operator yang di kontrol
            case 1: //Nilai yang diberikan 1
                result = number1 + number2; //Rumus perhitungan penjumlahan
                lprocess="+"; //Variabel lproses = +
                break; //Fungsi untuk berhenti dan keluar dari pernyataan, apabila nilai 1 dipilih
            case 2: //Nilai yang diberikan 2
                result = number1 - number2; //Rumus perhitungan pengurangan
                lprocess="-"; //Variabel lproses = -
                break; //Fungsi untuk berhenti dan keluar dari pernyataan, apabila nilai 2 dipilih
            case 3: //Nilai yang diberikan 3
                result = number1 * number2; //Rumus perhitungan perkalian
                lprocess="*"; //Variabel lproses = *
                break; //Fungsi untuk berhenti dan keluar dari pernyataan, apabila nilai 3 dipilih
            case 4: //Nilai yang diberikan 4
                result = number1 / number2; //Rumus perhitungan pembagian
                lprocess="/"; //Variabel lproses = /
                break; //Fungsi untuk berhenti dan keluar dari pernyataan, apabila nilai 4 dipilih
        }
        number3 = number1; //Nilai number1 disimpan di number3
        number1 = result; //Nilai result disimpan di variabel number1
    }
}
