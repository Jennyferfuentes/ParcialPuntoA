package parcial1;



public class jf {
       double hipotenusa, areacir, areacua, arectan;
       
       double hallar_area_hipotenusa(double num1, double num2){
        hipotenusa = Math.hypot(num1, num2);
        
        
        return hipotenusa;  
        
       }
    double Area_circulo(double rad) {
     areacir= Math.PI *Math.pow(rad, 2);
    
       return areacir;
    } 
    double Area_cuadrado(double lado){
     areacua = lado*lado;
     
     return areacua;
     
    }
    double Area_rectangulo(double base, double altura){
      arectan = base*altura;
      
      return arectan;
    }
}
