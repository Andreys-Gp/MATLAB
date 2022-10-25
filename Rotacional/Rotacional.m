% angulo (RHO =h y angulo FI=j) declaramos el resto variables como deseamos
syms x y z r p h j e ln

%ROTACIONAL

%coordenadas cartesianas
   %{
   %coordenada ax
    X=(e^(x*y));
   %coordenada ay
   Y=(sin(x*y));
   %coordenada az
   Z=(cos(x*y)*cos(x*y));
   %operacion
   ROT=[(diff(Z,y) - diff(Y,z))    (diff(X,z) - diff(Z,x))    (diff(Y,x) - diff(X,y)) ];
    display(ROT);
    %}

%coordenadas cilindricas 
   
   %coordenada ap
   P=(p*(z^2)*cos(h));
   %coordenada ah
   H=(0);
   %coordenada az
   Z=(z*sin(h)*sin(h));
   %operacion
   ROT=[ [(1/p)*diff(Z,h) - diff(H,z)]   [diff(P,z) - diff(Z,p)]    [(1/p)*( diff(p*H,p) - diff(P,h) )] ];
    display(ROT);
    


%coordenada esferica
   %{
   %coordenada ar
     R=(r*cos(j));
   %coordenada aj
   J=(-1*(1/r)*sin(j));
   %coordenada ah
    H=(2*r^2*sin(j));
    %operacion 
    %derivada vector en funcion ar
    AR=((1/r*sin(j))*( diff((sin(j))*H,j)-diff(J,h)));
    %derivada vector en funcion aj
    AJ=(((1/r)*((1/sin(j))*diff(R,h) - diff(r*H,r))));
    %derivada vector en funcion de ah
    AH=((1/r)*(diff(r*J,r)-diff(R,j)));
    
    ROT=[ AR  AJ  AH ];
    display(ROT);
    %}
    
    
    