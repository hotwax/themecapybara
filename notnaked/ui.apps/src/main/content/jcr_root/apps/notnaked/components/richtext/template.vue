<template>
  <notnaked-components-block v-bind:model="model">
    <div class="p-5" v-if="isEditAndEmpty">no content defined for component</div>
    <div v-else>
      <h2 v-html="model.title"></h2>
      <div class="w-full flex flex-col md:-mx-3">
        <div class="flex-grow md:px-3" v-html="model.text">richtext</div>
      </div>
    </div>
  </notnaked-components-block>
</template>

<script>
    export default {
        props: ['model'],
        computed: {
          isEditAndEmpty() {
              if(!$peregrineApp.isAuthorMode()) return false
              return this.$helper.areAllEmpty(this.model.text, this.model.title)
          }
        }
    }
</script>

