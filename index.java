// Replace the existing event listener code with the following

const leftButton = document.getElementById('left-button');
const rightButton = document.getElementById('right-button');

leftButton.addEventListener('click', () => {
  targetSpeed = -5;
});

rightButton.addEventListener('click', () => {
  targetSpeed = 5;
});

leftButton.addEventListener('touchstart', () => {
  targetSpeed = -5;
});

rightButton.addEventListener('touchstart', () => {
  targetSpeed = 5;
});

leftButton.addEventListener('touchend', () => {
  targetSpeed = 0;
});

rightButton.addEventListener('touchend', () => {
  targetSpeed = 0;
});

// Remove or comment out the previous event listeners for 'ArrowLeft' and 'ArrowRight' keys.
