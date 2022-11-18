const showMenu = document.getElementById('showMenu');
const closeMenu = document.getElementById('closeMenu');
const overlay = document.getElementById('overlay');

showMenu.addEventListener('click', () => {
  overlay.style.display = 'block';
});

closeMenu.addEventListener('click', () => {
  overlay.style.display = 'none';
});
