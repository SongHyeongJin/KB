<!-- 
    입력창에 할 일을 입력하고 enter를 누르거나, 등록 버튼을 클릭했을 때 입력한다.
    1. 사용자가 어떤 데이터를 입력했는지 알기 위해서는 데이터를 정의 해야 한다.
    2. v-model 디렉티브 입력창과 양방향 데이터 바인딩을 처리해야 한다.
    3. 입력창에서 enter나 등록 버튼을 클릭하면 사용자가 어떤 값을 입력했는지 확인할 수 있도록 
    이벤트를 등록하자
-->
<template>
  <div class="todo__input">
    <!-- 정의한 inputMsg를 양방향 데이터 바인딩 -->
    <input
      v-model="inputMsg"
      type="text"
      class="todo__input-text"
      placeholder="할 일을 입력하세요."
      @keydown.enter="addTodo"
    />
    <button class="todo__input-btn" @click="addTodo">등록</button>
  </div>
</template>
<script>
export default {
  data() {
    return {
      inputMsg: '', //입력 todo 데이터 정의
    };
  },
  emits: ['addTodo'],
  methods: {
    addTodo() {
      // console.log(this.inputMsg); //할일 출력
      this.$emit('addTodo', this.inputMsg); //부모 컴포넌트 이벤트 호출
      this.inputMsg = ''; //입력 데이터 초기화  왜? 문자열이라서 계속 추가되기 때문.
    },
  },
};
</script>
