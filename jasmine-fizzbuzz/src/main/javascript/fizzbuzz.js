function fizzbuzz() {
   var arr = new Array(100);
   arr[0]=1;
   for(var i=1;i<101;i++){
     if(i%15 === 0) {
        arr[i-1]="FizzBuzz";
     } else if (i%3 === 0) {
        arr[i-1]="Fizz";
     } else if (i%5 === 0) {
        arr[i-1]="Buzz";
     }
   }
   return arr ;
}
