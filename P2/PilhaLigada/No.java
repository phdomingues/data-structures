public class No 
{
   private int elemento;
   private No proximo;
   
   //construtores
   public No()
   {
      this (0, null);
   }
   
   public No(int e, No n)
   {
      elemento = e;
      proximo = n;
   }
   
   //metodos de atualiza      
   public void setElemento(int novoElemento)
   {
      elemento = novoElemento;
   }
   
   public void setProximo(No novoProximo)
   {
      proximo = novoProximo;
   }
   
   //metodos de obten
   public int getElemento()
   {
      return elemento;
   }
   
   public No getProximo()
   {
      return proximo;
   }
}