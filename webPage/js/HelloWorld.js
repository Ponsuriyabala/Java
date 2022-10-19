// // Variables
// console.log("Hello world")
// let num=4
// console.log(num)
// console.log(num+2)
// let userName="Suriya"
// console.log(userName)
// // Constants
// let radius=2
// const pi=3.14
// let area 
// area=pi* radius^2
// console.log(area)
// //datatype
// let num1=1505050505050050505050501n
// console.log(num1)


// // check type of datatype
// console.log(typeof num1)
// let user="pon \"suriya\" bala"
// console.log(user)
// let user1="pon\tsuriya\nbala"
// console.log(user1)
// let bool=5<6
// console.log(bool)
// // conversation
// let num2=String(123)
// console.log(num2, typeof num2)
// let num3=Number("123")
// console.log(num3,typeof num3)


// // system.out
// console.log(`the addition ${num} and ${num2} == ${num+num2}`)


// // object
// let a={
//     username:'navin',
//     dept:'it'
// }
// console.log(a)
// console.log(a.username)
// console.log(a['dept'])


// // input
// let input='username'
// let a1={
//     username:'navin',
//     dept:'it'
// }
// console.log(a1)
// console.log(a1.username)
// console.log(a1[input])


// // complex object
// let b={
//     username:'navin',
//     dept:'it',
//     detail:{
//         age:23,
//         college:'anna uni'
//     }
// }
// console.log(b.detail.age)
// console.log(b.detail.college.length)
// console.log(b.detail.collegee?.length)
// //delete object
// delete b.detail
// delete b.dept
// console.log(b)


////for in
// let c={
//     username:'navin',
//     dept:'it',
//     detail:{
//         age:23,
//         college:'anna uni'
//     }
// }
// for(let key in c){
//     console.log(key)
// }
// for(let key in c){
//     console.log(key,c[key])
// }


// //functions
// function meetu(){
//     console.log("meet u soon")
// }
// meetu();


// //function passing and return
// function meetu(a){
//         return `meet u ${a}`
//     }
//     let str='suriya'
//     console.log(meetu(str));


// // funcionExpression
// let add=function(num1,num2)
//         {
//             return num1+num2;
//         }
//         let result=add(5,6)
//         console.log(result);


// //Arrow function
// let add=(num1,num2)=>
//         {
//             return num1+num2;
//         }
//         let result=add(5,6)
//         console.log(result);
 
// let add=(num1,num2)=> num1+num2;//for single statement

//         let result=add(5,6)
//         console.log(result);



// //methods and this
// let  laptop={
//     cpu:"i7",
//     ram:16,
//     brand:"Dell",
//      running:function(n){
//         console.log(`${this.brand} running speed ${n} %`)
//     }
// }
// laptop.running(86);



// //constructor
// function suriya(uname,age){
//     this.name=uname,
//     this.age=age
// }
// let res=new suriya('ponsuriyabala',21)
// res.name='manual'
// console.log(res)



// //arrays and diff types
// let array=[1,2,3];
// array.push(5);
// console.log(array)
// console.log(array[0])

// let array=['suriya',5,tech='IT',function(){
//     console.log(`Hi ${array[0]}`)
// }];
// console.log(array)
// array[3]();



// //arrays fetching
// array=[5,7]
// console.log(array.push(9,8))
// console.log(array)
// console.log(array.splice(1/*index*/,2/*starts form index count*/,/*add elements*/5,6))
// console.log(array)
// console.log(array.unshift(2))
// console.log(array)
// console.log(array.shift())
// console.log(array)



//for of&for in
