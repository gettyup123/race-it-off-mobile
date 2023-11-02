const arrowLeftButton = document.getElementById('arrow-left-button');
const arrowRightButton = document.getElementById('arrow-right-button');
let arrowLeftPressed = false;
let arrowRightPressed = false;

arrowLeftButton.addEventListener('mousedown', () => {
  arrowLeftPressed = true;
  handleButtonPress();
});

arrowLeftButton.addEventListener('mouseup', () => {
  arrowLeftPressed = false;
  handleButtonPress();
});

arrowRightButton.addEventListener('mousedown', () => {
  arrowRightPressed = true;
  handleButtonPress();
});

arrowRightButton.addEventListener('mouseup', () => {
  arrowRightPressed = false;
  handleButtonPress();
});

function handleButtonPress() {
  if (arrowLeftPressed && !arrowRightPressed) {
    targetSpeed = -5; // Adjust the speed as needed
  } else if (arrowRightPressed && !arrowLeftPressed) {
    targetSpeed = 5; // Adjust the speed as needed
  } else {
    targetSpeed = 0;
  }
}

// Rest of your existing JavaScript code
