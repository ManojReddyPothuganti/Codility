double perfectCity(double[] departure, double[] destination) {
    double dist = 0.0 ;
    if(departure[1] == Math.floor(departure[1]))
    {
        if(Math.floor(destination[0])>departure[0])
        {
            dist = Math.abs(Math.floor(destination[0]) - departure[0]) + Math.abs(departure[1]-destination[1]) + Math.abs(destination[0]-Math.floor(destination[0]));
        }
        else {
            dist = Math.abs(Math.ceil(destination[0]) - departure[0]) + Math.abs(departure[1]-destination[1]) + Math.abs(destination[0]-Math.ceil(destination[0]));
        }
            
    }
    else{
        if(Math.floor(destination[1])>departure[1])
        { 
            dist = Math.abs(Math.ceil(destination[1]) - departure[1]) + Math.abs(departure[0]-destination[0]) + Math.abs(destination[1]-Math.ceil(destination[1]));
            
        }
        else {
            dist = Math.abs(Math.floor(destination[1]) - departure[1]) + Math.abs(departure[0]-destination[0]) + Math.abs(destination[1]-Math.floor(destination[1]));
        }
        
    }
    
return dist ;
}
