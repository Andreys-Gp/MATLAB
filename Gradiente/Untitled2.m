%gradient operation a scalar 
% angulo (RHO =h y angulo FI=j) declaramos el resto variables como deseamos
syms x y z r p h j e ln
%declaramos la funcion


%GRADIENTE

  %funcion coordenadas cartesianas
  
  F= (4*x*z^2+3*y*z);
  display(F);
  A=[diff(F,x) diff(F,y)  diff(F,z)];
  display(A);
  %}
  
  %funcion coordenadas cilindricas 
    %{ 
  S=(2*cos(h)*p*z^2 + 2*cos(h)*p);
  display(S);
  B=[diff(S,p)  (1/p)*diff(S,h) diff(S,z)];
  display(B);
     %}
   
   %funcion coordenas esfericas 
   %{ 
   E=(r^2*cos(j)*cos(h));
   display(E);
   K=[diff(E,r)   (1/r)*diff(E,j)  (1/sin(j))*diff(E,h)];
   display(K);
     %}
   
