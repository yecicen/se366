//Runge-Kutta 4 Method for solving y'(x) = sin(x)^2 -y;

function F(x,y) {
   return Math.sin(x)*Math.sin(x)-y;
}

var y0 = 1, x0 = 0, y1, xn = 4, h = 0.1, f, k1, k2, k3, k4;

for(; x0 <xn; x0 = x0+h){

    f = F(x0, y0);  
    k1 = h * f;
    f = F(x0+h/2,y0+k1/2);
    k2 = h * f;
    f = F(x0+h/2,y0+k2/2);
    k3 = h * f;
    f = F(x0+h/2,y0+k2/2);
    k4 = h * f;
    y1 = y0 + ( k1 + 2*k2 + 2*k3 + k4)/6;


    //sorry for weird javascript decimal errors...
    console.log("k1: "+k1+" k2: "+k2+" k3: "+k3+" k4: "+k4);
    console.log("y( "+(x0+h)+" ): "+y1);

    y0 = y1;
}
