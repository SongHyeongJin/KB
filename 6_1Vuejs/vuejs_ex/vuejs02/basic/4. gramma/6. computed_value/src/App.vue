<!-- Computed
 data나 다른 속성이 변경될 때 함수가 실행되어 캐싱된 값으로
 함수의 실행은 의존하고 있는 속성, data가 변경될 때 한번만 호출된다.
 computed에 함수를 등록하여 사용하며
 함수명이 계산된 속성명이 된다.-->
<template>
  <h2>Small Items</h2>
  <p v-for="item in small_items_c" :key="item.id">{{ item.text }}</p>
  <p v-for="item in small_items_o" :key="item.id">{{ item.text }}</p>
  <h2>Big Items</h2>
  <p v-for="item in big_items_c" :key="item.id">{{ item.text }}</p>
  <p v-for="item in big_items_o" :key="item.id">{{ item.text }}</p>
</template>

<script>
import { reactive, computed } from 'vue';

export default {
  //Options API
  data() {
    return {
      arr: [
        { id: 1, text: '1번 옵션 아이템' },
        { id: 2, text: '2번 옵션 아이템' },
        { id: 3, text: '3번 옵션 아이템' },
        { id: 4, text: '4번 옵션 아이템' },
        { id: 5, text: '5번 옵션 아이템' },
      ],
    };
  },
  computed: {
    small_items_o() {
      return this.arr.filter((i) => i.id < 3);
    },
    big_items_o() {
      return this.arr.filter((i) => i.id >= 3);
    },
  },
  // Composition API
  setup() {
    const arr = reactive([
      { id: 1, text: '1번 아이템' },
      { id: 2, text: '2번 아이템' },
      { id: 3, text: '3번 아이템' },
      { id: 4, text: '4번 아이템' },
      { id: 5, text: '5번 아이템' },
    ]);

    const small_items_c = computed(() => {
      return arr.filter((i) => i.id < 3);
    });
    const big_items_c = computed(() => {
      return arr.filter((i) => i.id >= 3);
    });

    return {
      small_items_c,
      big_items_c,
    };
  },
};
</script>
