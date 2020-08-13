<template>
  <div v-bind:data-per-path="model.path">
    <h3>{{model.title}}</h3>
    <p>Products in the Best Seller category will be shown here.</p>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

