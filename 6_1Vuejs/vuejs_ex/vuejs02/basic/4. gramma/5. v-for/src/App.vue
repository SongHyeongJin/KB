<!-- v-for 디렉티브
 배열이나 객체 등 반복적인 데이터를 렌더링 할 때 사용하는 디렉티브이다.
  배열 사용시 v-for="변수 in 배열" {:key="id값"(생략가능)}
  인덱스까지 사용 시 v-for="(변수, index) in 배열" {:key="id값"(생략가능)}
  객체 사용시 v-for="값 in 객체" {:key="key"(생략가능)}
  속성의 이름(키)와 인덱스 사용시 v-for="(값, key, index) in 객체" {:key="key"(생략가능)}
  -->
<template>
  <div style="width: 200px">
    <ol>
      <li v-for="item in items">{{ item }}</li>
    </ol>
  </div>
</template>

<script>
import { reactive } from 'vue';

export default {
  // Composition API
  setup() {
    const items = reactive({ 1: '1번 객체', 2: '2번 객체', 3: '3번 객체' });
    return {
      items,
    };
  },
};
</script>
