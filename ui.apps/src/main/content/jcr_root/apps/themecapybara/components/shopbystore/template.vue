<template>
  <themecapybara-components-block v-bind:model="model">
    <div class="p-5" v-if="isEditAndEmpty">no content defined for component</div>
    <div v-else>
      <h2 v-html="model.title"></h2>
      <div class="w-full flex flex-col md:-mx-6">
        <p>Store products will be shown here.</p>
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
              return this.$helper.areAllEmpty(this.model.title)
          }
        }
    }
</script>

