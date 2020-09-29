/*
Implemente uma classe `QuadradoRedimensionavel`, que é _subclasse_ de 
`Quadrado` e implementa a interface `Redimensionavel`. 
Essa classe deve _implementar_  um construtor que recebe o valor de 
`lado` e o transmite para o construtor da __superclasse__.
*/
public class QuadradoRedimensionavel extends Quadrado implements Redimencionavel {
    
    public QuadradoRedimensionavel(double lado){
        this.lado = lado;
       
      //  return lado;
    
    }
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    //////////
     @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }
    
    @Override
    public void redimensionar(int percentual) {
        this.area += this.area * percentual / 100;
    }
    
}
