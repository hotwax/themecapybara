<template>
  <themecapybara-components-block v-bind:model="model">
    <div class="p-5" v-if="isEditAndEmpty">no content defined for component</div>
    <div v-else>
      <b>{{model.title}}</b>
      <div style="margin-left: 20px;" v-for="(item,i) in model.nav" :key="i">
        <a><p>{{item.title}}</p></a>
      </div>
    </div>
  </themecapybara-components-block>
</template>

<script>
  export default {
      props: ['model'],
      computed: {
          isEditAndEmpty() {
              if(!$peregrineApp.isAuthorMode()) return false
              return this.$helper.areAllEmpty(this.model.nav)
          }
      }
  }
</script>

