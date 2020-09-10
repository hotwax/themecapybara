<template>
  <themecapybara-components-block v-bind:model="model">
    <div class="p-5" v-if="isEditAndEmpty">no content defined for component</div>
    <div v-else>
      <center>
        <h2>{{model.title}}</h2>
        <b>{{model.subtitle}}</b>
      </center>
      <div class="flex flex-wrap -mx-3">
        <div class="card my-3 px-0 md:px-3 lg:w-1/3 md:w-1/2 w-full" v-for="(item,i) in model.imagesgrid" :key="i">
          <div class="flex flex-col h-full">
            <div class="self-center" v-bind:style="{width: item.imagewidth + &quot;%&quot;}">
              <v-lazy-image class="card-img pb-3"
              v-bind:src="$helper.pathToUrl(item.image)" v-bind:alt="item.imagealttext"
              v-if="item.image"></v-lazy-image>
            </div>
          </div>
        </div>
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
              return this.$helper.areAllEmpty(this.model.imagesgrid)
          }
      }
  }
</script>

