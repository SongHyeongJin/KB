<template>
    
  <div id="date1">
    <h2>{{ date }}</h2>
  </div>
</template>

<script>
export default {
  data() {
    return {
      data1: Date().toString(),
    };
  },
  created() {
    console.log(this.date);
    this.date = this.data1 ? this.data1 : '';
    console.log(this.date);
  },
  mounted() {
    console.log(this.date);
    this.date = this.data1 ? this.data1 : '';
  },
};
</script>
