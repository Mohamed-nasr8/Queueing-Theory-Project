

public class ModelMMI {
    private double λ, u, n, ρ;

    private double P0; 

   
    private double L; 
    private double Lq; 
    double W;
    double Wq;

    public ModelMMI(double λ, double u) {
        this.λ = λ;
        this.u = u;
    }
public void has_λ_u() {

        this.L = this.λ / (this.u - this.λ);
        if(this.L < 0)
            this.L = 0;
        this.Lq = Math.pow(this.λ, 2) / (this.u * (this.u - this.λ));
        if(this.Lq < 0)
            this.Lq = 0;
        this.W = 1 / (this.u - this.λ);
        if(this.W < 0)
            this.W = 0;
        this.Wq = this.λ / (this.u * (this.u - this.λ));
        if(this.Wq < 0)
            this.Wq = 0;
        this.ρ = λ / u;

    }
public String getL() {
        float temp = (float) L;
        return String.valueOf(temp);
    }

    public String getLq() {

        float temp = (float) Lq;
        return String.valueOf(temp);
    }
    public double probabilityCustomerOccupied() {
        // = 1-P0 = 1-(1-ρ) = ρ
        return this.ρ;
    }

    public String getP0() { // Get probability of no customers in the System
        float temp = (float) (1 - this.ρ);
        if( temp < 0 )
            temp = 0;
        return String.valueOf(temp);
    }

    public String getW() {
        
        float temp = (float) W;
        return String.valueOf(temp);
    }

    public String getWq() {
        
        float temp = (float) Wq;
        return String.valueOf(temp);
    }


    public void setλ(double λ) {
        this.λ = λ;
    }

    public void setU(double u) {
        this.u = u;
    }

    public void setλU(double λ, double u) {
        this.λ = λ;
        this.u = u;
    }

    public void λ_HourToMin() {
        this.λ = this.λ / 60;
    }

    public void u_HourToMin() {
        this.u = this.u / 60;
    }

    public void λu_HourToMin() {
        this.λ = this.λ / 60;
        this.u = this.u / 60;
    }

    public void λ_SecToMin() {
        this.λ = this.λ * 60;
    }

    public void u_SecToMin() {
        this.u = this.u * 60;
    }
    
    public void w_HourToMin(){
        this.W *=60;
    }
    
    public void W_SecToMin(){
        this.W /=60;
    }
    
    public void time_to_λ(){
        this.λ = 1/this.λ;
    }
    
    
    public void time_to_u(){
        this.u = 1/this.u;
    }
    
            
}
