<script>
export default {};
</script>
<template>
  <div class="calculator">
    <form name="forms">
      <input type="text" v-model="output" name="output" readonly />
      <input type="button" class="clear" value="C" @click="operation()" />
      <input type="button" class="operator" value="/" @click="operation()" />
      <input type="button" value="1" @click="operation()" />
      <input type="button" value="2" @click="operation()" />
      <input type="button" value="3" @click="operation()" />
      <input type="button" class="operator" value="*" @click="operation()" />
      <input type="button" value="4" @click="operation()" />
      <input type="button" value="5" @click="operation()" />
      <input type="button" value="6" @click="operation()" />
      <input type="button" class="operator" value="+" />
      <input type="button" value="7" @click="operation()" />
      <input type="button" value="8" @click="operation()" />
      <input type="button" value="9" @click="operation()" />
      <input type="button" class="operator" value="-" @click="operation()" />
      <input type="button" class="dot" value="." @click="operation()" />
      <input type="button" value="0" @click="operation()" />
      <input
        type="button"
        class="operator result"
        value="="
        @click="operation()"
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
