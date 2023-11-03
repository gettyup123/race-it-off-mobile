document.addEventListener('touchmove', (event) => {
  const touchX = event.touches[0].clientX;
  // Bereken de nieuwe positie van de auto op basis van de positie van de aanraking
  carPosition = touchX - container.offsetLeft - car.clientWidth / 2;
  // Zorg ervoor dat de auto niet buiten de grenzen van het speelveld gaat
  carPosition = Math.max(0, Math.min(container.clientWidth - car.clientWidth, carPosition));
  // Pas de positie van de auto aan
  car.style.left = carPosition + 'px';
});
// Verwijder deze lijnen
document.addEventListener('keydown', handleKeyPress);
document.addEventListener('keyup', handleKeyUp);
