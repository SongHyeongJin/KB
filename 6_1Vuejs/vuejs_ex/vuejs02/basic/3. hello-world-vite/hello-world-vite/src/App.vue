<template>
<<<<<<< HEAD
    
  <div id="date1">
    <h2>{{ date }}</h2>
=======
  <div id="date">
    {{ date }}
  </div>
  <div id="date2">
    {{ date2 }}
>>>>>>> ef326463b4c65dd1c2095f8bd67f870152280cae
  </div>
</template>

<script>
export default {
<<<<<<< HEAD
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
=======
  setup() {
    const date = Date().toString();
    return {
      date,
    };
  },

  data() {
    return {
      data2: Date().toString(),
    };
>>>>>>> ef326463b4c65dd1c2095f8bd67f870152280cae
  },
};
</script>
