
% angulo (RHO =h y angulo FI=j) declaramos el resto variables como deseamos
syms x y z r p h j e ln

   %DIVERGENCIA
   
   %coordenadas cartesianas
   %{
   %coordenada ax
    X=(e^(x*y));
   %coordenada ay
   Y=(sin(x*y));
   %coordenada az
   Z=(cos(x*y)*cos(x*y));
   %operacion
   DIV=[diff(X,x) + diff(Y,y) + diff(Z,z)];
    display(DIV);
    %}
   
   %coordenadas cilindricas 
   %{
   %coordenada ap
   P=(p*(z^2)*cos(h));
   %coordenada ah
   H=(0);
   %coordenada az
   Z=(z*sin(h)*sin(h));
   %operacion
   DIV=[ (1/p)*diff(p*P,p) + (1/p)*diff(H,h)   +    diff(Z,z)];
    display(DIV);
    %}
   
   %coordenada esferica
   
   %coordenada ar
     R=((1/r^2)*cos(j));
   %coordenada aj
   J=(r*sin(j)*cos(h));
   %coordenada ah
    H=(cos(j));
    %operacion 
     DIV=[ (1/r^2)*diff((r^2)*R,r) + (1/r*sin(j))*diff((sin(j))*J,j) + (1/r*sin(j))*diff(H,h)];
    display(DIV);
   
    