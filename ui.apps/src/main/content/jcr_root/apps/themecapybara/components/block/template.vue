<template>
  <component class="w-full px-5 flex flex-col justify-center" ref="section"
  v-bind:class="[classes, colors, model.component]" v-bind:style="[styles, sticky]"
  v-bind:data-per-path="model.path" v-bind:is="model.htmlelement || &quot;div&quot;"
  v-bind:id="model.anchorname">
    <div class="embed-responsive embed-responsive-16by9 w-full h-full top-0 left-0"
    v-if="model.custombackground === 'true' &amp;&amp; model.backgroundtype == 'video' &amp;&amp; model.bgvideo"
    v-bind:style="`position:${'absolute'};pointer-events:${'none'};z-index:${'-1'};`">
      <iframe class="w-full h-full" v-bind:src="videoSource"></iframe>
    </div>
    <div class="flex min-h-1" v-bind:class="{
            'container mx-auto' : model.blockwidth === 'default',
            'w-full max-w-3xl mx-auto' : model.blockwidth === 'article'
        }">
      <slot></slot>
    </div>
  </component>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

