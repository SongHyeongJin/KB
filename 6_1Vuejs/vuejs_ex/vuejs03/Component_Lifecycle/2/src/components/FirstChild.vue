<<<<<<< HEAD
<!-- Vue에서는 HTML에서 지원하지 않는 ref 속성을 지원하고 있다.
     ref 속성은 문서객체(DOM)을 참조할때와 컴포넌트를 참조할때 사용
     -->
=======
<!-- 뷰에서는 HTML에서 지원하지 않는 ref 속성을 지원하고 있다.
      ref속성은 문서객체(DOM)을 참조할때와 컴포넌트를 참조할때 사용
 -->
>>>>>>> 259cbabf4b327fba3eed75a6ba1de84659df2a79
<script>
export default {
  data() {
    return {
      num: 5,
    };
  },
  computed: {
    doubleNum() {
      return this.num * 2;
    },
  },
  methods: {
    increment() {
      this.num++;
    },
  },
};
<<<<<<< HEAD
// const doc = document.querySelector('h1'); //html에서 사용하는 방법
// const txt = doc.innerText;
// console.log(txt);
=======
>>>>>>> 259cbabf4b327fba3eed75a6ba1de84659df2a79
</script>
<template>
  <h1>{{ num }}</h1>
</template>
