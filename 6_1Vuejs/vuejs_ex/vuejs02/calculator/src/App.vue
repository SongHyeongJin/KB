<script>
export default {
  data() {
    return {
<<<<<<< HEAD
      cur: null, //현재 입력값
      output: null, //화면 출력값
      prev: null,
      operator: null,
      errorMessages: '',
    };
  },
  methods: {
    clear() {
      this.cur = null;
      this.prev = null;
      this.operator = '';
      this.output = '';
    },
    isOperator(event) {
      const op = event.currentTarget.value;
      if (op === '+' || op === '-' || op === '*' || op === '/') {
        this.handleOperator(op);
      } else {
        return;
      }
    },
    setError() {
      this.output = this.errorMessages;
      console.log(this.output);
      this.cur = null;
      this.prev = null;
      this.operator = null;
      this.clearError();
    },
    clearError() {
      this.errorMessages = '';
    },
    handleNumberInput(event) {
      const n = event.currentTarget.value;
      this.cur = this.cur === null ? n : (this.cur += n);
      this.output = this.cur;
    },
    handleOperator(op) {
      const n = op;
      switch (n) {
        case '+':
          this.operator = '+';
          break;
        case '-':
          this.operator = '-';
          break;
        case '*':
          this.operator = '*';
          break;
        case '/':
          this.operator = '/';
          break;
        default:
          this.operator = '';
          break;
      }
      this.prev = this.cur;
      this.cur = null;
      this.output = null;
    },
    handleEqual() {
      if (this.canCalculate()) {
        this.computeResult();
      }
    },
    canCalculate() {
      return this.prev !== null && this.cur !== null && this.operator !== null;
    },
    computeResult() {
      const left = Number(this.prev);
      const right = Number(this.cur);
      const result = this.operatorActions(this.operator, left, right);
      if (result === null) return;
      this.cur = result;
      this.output = result;
      this.prev = null;
      this.operator = null;
    },
    operation() {},
    operatorActions(operator, left, right) {
      switch (operator) {
        case '+':
          return left + right;
        case '-':
          return left - right;
        case '*':
          return left * right;
        case '/':
          if (right === 0) {
            this.errorMessages = '숫자를 0으로 나눌 수 없습니다.';
            this.setError();
            return null;
          } else {
            return left / right;
          }
      }
=======
      cur: '',
      output: '',
    };
  },
  methods: {
    isOperator(value) {
      return value === '+' || value === '-' || value === '*' || value === '/';
    },

    operation(event) {
      const n = event.currentTarget.value;

      // C 버튼
      if (n === 'C') {
        this.cur = '';
        this.output = '';
        return;
      }

      // = 버튼
      if (n === '=') {
        this.calculate();
        return;
      }

      // 현재 마지막 문자
      const lastChar = this.cur[this.cur.length - 1];

      // 연산자 중복 입력 방지
      if (this.isOperator(n)) {
        // 아무것도 입력되지 않은 상태에서 연산자 입력 막기
        if (this.cur === '') {
          return;
        }

        // 마지막 문자도 연산자라면, 마지막 연산자를 새 연산자로 교체
        if (this.isOperator(lastChar)) {
          this.cur = this.cur.slice(0, -1) + n;
          this.output = this.cur;
          return;
        }
      }

      // 일반 입력
      this.cur += n;
      this.output = this.cur;
    },

    calculate() {
      let operator = '';

      if (this.cur.includes('+')) {
        operator = '+';
      } else if (this.cur.includes('-')) {
        operator = '-';
      } else if (this.cur.includes('*')) {
        operator = '*';
      } else if (this.cur.includes('/')) {
        operator = '/';
      } else {
        return;
      }

      const parts = this.cur.split(operator);

      const left = Number(parts[0]);
      const right = Number(parts[1]);

      if (parts[0] === '' || parts[1] === '') {
        return;
      }

      let result = 0;

      if (operator === '+') {
        result = left + right;
      } else if (operator === '-') {
        result = left - right;
      } else if (operator === '*') {
        result = left * right;
      } else if (operator === '/') {
        if (right === 0) {
          this.output = '오류';
          this.cur = '';
          return;
        }
        result = left / right;
      }

      this.cur = String(result);
      this.output = String(result);
>>>>>>> 61189cf75424e725c002c05f0fcf79faf6e9924e
    },
  },
};
</script>
<<<<<<< HEAD
<template>
  <div class="calculator">
    <form name="forms">
      <input type="text" name="output" v-model="output" readonly />
      <input type="button" class="clear" value="C" @click="clear()" />
      <input
        type="button"
        class="operator"
        value="/"
        @click="isOperator($event)"
      />
      <input type="button" value="1" @click="handleNumberInput($event)" />
      <input type="button" value="2" @click="handleNumberInput($event)" />
      <input type="button" value="3" @click="handleNumberInput($event)" />
      <input
        type="button"
        class="operator"
        value="*"
        @click="isOperator($event)"
      />
      <input type="button" value="4" @click="handleNumberInput($event)" />
      <input type="button" value="5" @click="handleNumberInput($event)" />
      <input type="button" value="6" @click="handleNumberInput($event)" />
      <input
        type="button"
        class="operator"
        value="+"
        @click="isOperator($event)"
      />
      <input type="button" value="7" @click="handleNumberInput($event)" />
      <input type="button" value="8" @click="handleNumberInput($event)" />
      <input type="button" value="9" @click="handleNumberInput($event)" />
      <input
        type="button"
        class="operator"
        value="-"
        @click="isOperator($event)"
      />
      <input
        type="button"
        class="dot"
        value="."
        @click="handleNumberInput($event)"
      />
      <input type="button" value="0" @click="handleNumberInput($event)" />
=======

<template>
  <div class="calculator">
    <form name="forms">
      <input type="text" v-model="output" name="output" readonly />

      <input type="button" class="clear" value="C" @click="operation" />
      <input type="button" class="operator" value="/" @click="operation" />
      <input type="button" value="1" @click="operation" />
      <input type="button" value="2" @click="operation" />
      <input type="button" value="3" @click="operation" />
      <input type="button" class="operator" value="*" @click="operation" />
      <input type="button" value="4" @click="operation" />
      <input type="button" value="5" @click="operation" />
      <input type="button" value="6" @click="operation" />
      <input type="button" class="operator" value="+" @click="operation" />
      <input type="button" value="7" @click="operation" />
      <input type="button" value="8" @click="operation" />
      <input type="button" value="9" @click="operation" />
      <input type="button" class="operator" value="-" @click="operation" />
      <input type="button" class="dot" value="." @click="operation" />
      <input type="button" value="0" @click="operation" />
>>>>>>> 61189cf75424e725c002c05f0fcf79faf6e9924e
      <input
        type="button"
        class="operator result"
        value="="
<<<<<<< HEAD
        @click="handleEqual($event)"
=======
        @click="operation"
>>>>>>> 61189cf75424e725c002c05f0fcf79faf6e9924e
      />
    </form>
  </div>
</template>
<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  background-color: #ffffff;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}

.calculator {
  width: 287px;
  border: 1px solid #333;
  background-color: #ccc;
  padding: 5px;
}

.calculator form {
  display: grid;
  grid-template-columns: repeat(4, 65px);
  grid-auto-rows: 65px;
  grid-gap: 5px;
}

.calculator form input {
  border: 2px solid #333;
  cursor: pointer;
  font-size: 19px;
}

.calculator form input:hover {
  box-shadow: 1px 1px 2px #333;
}

.calculator form .clear {
  background-color: #ed4848;
}

.calculator form .operator {
  background-color: orange;
}

.calculator form .dot {
  background-color: green;
}

.calculator form input[type='text'] {
  grid-column: span 4;
  text-align: right;
  padding: 0 10px;
}

.calculator form .clear {
  grid-column: span 3;
}

.calculator form .result {
  grid-column: span 2;
}
</style>
