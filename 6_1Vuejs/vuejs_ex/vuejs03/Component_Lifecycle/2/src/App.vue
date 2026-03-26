<script>
import FirstChild from './components/FirstChild.vue';
<<<<<<< HEAD
=======

>>>>>>> 259cbabf4b327fba3eed75a6ba1de84659df2a79
export default {
  components: {
    FirstChild,
  },

  mounted() {
    const childNum = this.$refs.child.num;
    const childDoubleNum = this.$refs.child.doubleNum;
<<<<<<< HEAD
    console.log(`메서드 호출전: ${childNum}`); //5
    console.log(`메서드 호출후: ${childDoubleNum}`); //10

    setTimeout(() => {
      this.$refs.child.increment();
      console.log(`메서드 호출전: ${childNum}`); //5
      console.log(`메서드 호출후: ${childDoubleNum}`); //10
=======
    console.log(`메서드 호출전 :  ${childNum}`); //5
    console.log(`메서드 호출후 :  ${childDoubleNum}`); //10

    setTimeout(() => {
      this.$refs.child.increment();
      console.log(`메서드 호출전 :  ${childNum}`); //5
      console.log(`메서드 호출후 :  ${childDoubleNum}`); //10
>>>>>>> 259cbabf4b327fba3eed75a6ba1de84659df2a79
    }, 1000);
  },
};
</script>
<template>
  <FirstChild ref="child" />
</template>
