const input = document.getElementById('input');
const btn = {};
btn.ac = document.getElementById('ac');
btn.plusMinus = document.getElementById('plusMinus');
btn.percent = document.getElementById('percent');
btn.divide = document.getElementById('divide');
btn.times = document.getElementById('times');
btn.min = document.getElementById('min');
btn.plus = document.getElementById('plus');
btn.comma = document.getElementById('comma');
btn.equal = document.getElementById('equal');

const num = [];
for (let i = 0; i < 10; i++) {
  num[i] = document.getElementById(`${i}`);
  num[i].addEventListener('click', () => { 
    if (input.innerHTML.length <= 10) {
      input.innerHTML += `${i}`;
    }
  });
}

const data = [];
const clearInput = () => input.innerHTML = '';
const getInput = () => parseInt(input.innerHTML);
const setInput = str => input.innerHTML = `${str}`;

btn.ac.addEventListener('click', () => {
  clearInput();
  data.length = 0;
});

btn.divide.addEventListener('click', () => {
  data.push(getInput());
  data.push('/');
  clearInput();
});

btn.times.addEventListener('click', () => {
  data.push(getInput());
  data.push('*');
  clearInput();
});

btn.min.addEventListener('click', () => {
  data.push(getInput());
  data.push('-');
  clearInput();
});

btn.plus.addEventListener('click', () => {
  data.push(getInput());
  data.push('+');
  clearInput();
});

btn.equal.addEventListener('click', () => {
  data.push(getInput());
  clearInput();
  const ans = eval(data.join(''));
  setInput(ans);
  data.length = 0;
});
