
package KubusBalok;

public class bangunRuang {
    double p, l, t, s;
    
    public double hitungVolume(double s){
        return s * s * s;
    }
    
    public double hitungVolume (double p, double l,double t){
        return p * l * t;
    }
    
    public double hitungLuasPermukaan(double p, double l, double t){
         return (2 * p * l) + (2 * p * t) + (2 * l * t);
    }
    
    public double hitungLuasPermukaan (double s){
        return 6 * s * s;
    }   
}
