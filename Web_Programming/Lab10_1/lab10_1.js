let ctx = document.getElementById('myCanvas').getContext('2d');
let bn1 = document.getElementById('button1');
let box1 = document.getElementById('box1');
bn1.addEventListener('click', runAnimation);
let timerID;
let dotX = [0] * box1.value;
let dotY = [0] * box1.value;
let dotMX = [0] * box1.value;
let dotMY = [0] * box1.value;
let dotColor = [0] * box1.value;
function runAnimation(){
    let randomMovementXAndY = 20*(Math.random()-0.5);
    for(let i = 0; i < box1.value;i++){
        dotX[i] += dotMX;
        dotY[i] += dotMY;
        dotMX[i] = randomMovementXAndY;
        dotMY[i] = randomMovementXAndY;
        dotColor[i] = 'rgb(' + Math.floor(Math.random()
    * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256)
    + ')';
    }
    if(timerID == null){
        timerID = setInterval(moveDot, 100);
    }

}
function moveDot(){
    for(let i = 0; i < box1.value; i++){
        ctx.save();
        ctx.arc(dotX[i] + 400, dotY[i] + 250, 5, 0, 2*Math.PI);
        ctx.fill();
    }
 
}
