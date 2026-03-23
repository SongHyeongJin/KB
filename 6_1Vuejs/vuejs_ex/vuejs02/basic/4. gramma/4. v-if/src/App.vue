<!-- v-if를 활용한 비교 
 v-if='조건' : 조건에 맞지 않을 경우 화면에 출력하지 않는다.
 v-else, v-else-if : v-if와 함께 사용하며 
 if문의 else, else if와 같은 경우라고 보면 된다.-->
<template>
  <p>{{ counter }}</p>
  <p v-if="counter < 5">5보다 작습니다.</p>
  <p v-else>5와 같거나 큽니다.</p>
  <button @click="counter++">클릭하면 숫자가 올라갑니다.</button>
</template>

<script>
import { ref } from 'vue';

export default {
  // Composition API
  setup() {
    let counter = ref(0);
    return {
      counter,
    };
  },
};
</script>
