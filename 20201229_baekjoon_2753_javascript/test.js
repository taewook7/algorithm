var set=require("fs");
var input = set.readFileSync("/dev/stdin").toString().split(" ");
const a = Number(input);
let num = 0;
if (a <=4000 && a>=1) {
if( (a%4==0 && a%100 != 0) ||  a%400==0){
    num=1;
    // console.log("1");
} else if(89>=a && a>=80) {
    num=0;
    // console.log("0");
}
console.log(num);
}
