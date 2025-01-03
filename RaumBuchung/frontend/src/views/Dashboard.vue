<template>
  <div class="min-h-screen bg-gray-50">
    <!-- Header -->
    <header class="p-4 border-b">
      <div class="flex justify-between items-center max-w-7xl mx-auto">
        <div class="text-2xl font-bold text-red-500">DESKplus</div>
        <div class="flex gap-4">
          <button class="p-2 hover:bg-gray-100 rounded-full">
            <BellIcon class="h-6 w-6 text-gray-600"/>
          </button>
          <div class="flex gap-2">
            <button class="px-4 py-2 rounded-full border hover:bg-gray-100">
              CANCEL
            </button>
            <button class="px-4 py-2 rounded-full bg-red-500 text-white hover:bg-red-600">
              Buchen
            </button>
          </div>
        </div>
      </div>
    </header>

    <!-- Main Content -->
    <main class="max-w-7xl mx-auto p-4">
      <!-- Date Navigation -->
      <div class="flex gap-4 mb-8">
        <button
            v-for="tab in ['Heute', 'Morgen', 'Datum']"
            :key="tab"
            :class="[
            'px-6 py-2 rounded-full border',
            selectedTab === tab ? 'bg-red-500 text-white border-red-500' : 'hover:bg-gray-100'
          ]"
            @click="selectedTab = tab"
        >
          {{ tab }}
        </button>
      </div>

      <div class="grid grid-cols-1 md:grid-cols-12 gap-8">
        <!-- Calendar Section -->
        <div class="md:col-span-3">
          <div class="p-4 border rounded-lg">
            <div class="flex items-center justify-between mb-4">
              <h2 class="text-sm font-medium">Datum und Uhrzeit</h2>
              <div class="flex gap-2">
                <button class="p-1 hover:bg-gray-100 rounded">
                  <ChevronLeftIcon class="h-5 w-5"/>
                </button>
                <button class="p-1 hover:bg-gray-100 rounded">
                  <ChevronRightIcon class="h-5 w-5"/>
                </button>
              </div>
            </div>
            <div class="text-center mb-4">
              <h3 class="font-medium">February 2022</h3>
            </div>
            <div class="grid grid-cols-7 gap-1">
              <div v-for="day in ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']"
                   :key="day"
                   class="text-xs text-center py-1">
                {{ day }}
              </div>
              <button v-for="date in 28"
                      :key="date"
                      :class="[
                        'text-sm p-2 rounded-full hover:bg-gray-100',
                        selectedDate === date ? 'bg-red-500 text-white' : ''
                      ]"
                      @click="selectedDate = date">
                {{ date }}
              </button>
            </div>
          </div>
        </div>

        <!-- Floor Plan Section -->
        <div class="md:col-span-6">
          <div class="border rounded-lg p-4">
            <div class="flex items-center justify-between mb-4">
              <h2 class="text-sm font-medium">Sitzplatz</h2>
              <div class="flex items-center gap-2 text-sm">
                <span>Dropdown:</span>
                <span class="text-gray-500">Widescreen, Telefon, StandingDesk, Dual Monitor</span>
              </div>
            </div>
            <div class="grid grid-cols-3 gap-4">
              <div v-for="desk in 9"
                   :key="desk"
                   :class="[
                     'border-2 rounded-lg p-4 aspect-video cursor-pointer hover:border-gray-400',
                     selectedDesk === desk ? 'border-red-500' : 'border-gray-200'
                   ]"
                   @click="selectDesk(desk)">
                <div class="h-full flex items-center justify-center">
                  Desk {{ desk }}
                </div>
              </div>
            </div>
            <div class="flex gap-4 mt-4">
              <div class="flex items-center gap-2">
                <div class="w-4 h-4 border-2 border-gray-200"></div>
                <span class="text-sm">Verfügbar</span>
              </div>
              <div class="flex items-center gap-2">
                <div class="w-4 h-4 bg-gray-300"></div>
                <span class="text-sm">Belegt</span>
              </div>
              <div class="flex items-center gap-2">
                <div class="w-4 h-4 bg-red-500"></div>
                <span class="text-sm">Ausgewählt</span>
              </div>
            </div>
          </div>
        </div>

        <!-- Booking Details Section -->
        <div class="md:col-span-3">
          <div class="border rounded-lg p-4">
            <h2 class="text-sm font-medium mb-4">Deine Buchung</h2>
            <div class="mb-8">
              <div class="text-center p-4 border rounded-lg">
                Tisch {{ selectedDesk || '...' }}
              </div>
            </div>
            <div class="space-y-4">
              <h3 class="text-sm font-medium">Zeitraum</h3>
              <div class="flex gap-2">
                <button
                    v-for="period in ['vormittag', 'nachmittag']"
                    :key="period"
                    :class="[
                    'flex-1 px-4 py-2 rounded-full',
                    selectedPeriod === period ? 'bg-red-500 text-white' : 'border hover:bg-gray-100'
                  ]"
                    @click="selectedPeriod = period"
                >
                  {{ period }}
                </button>
              </div>
              <div class="grid grid-cols-2 gap-4">
                <div>
                  <label class="block text-sm mb-2">Start</label>
                  <input type="time" class="w-full border rounded-full px-4 py-2">
                </div>
                <div>
                  <label class="block text-sm mb-2">Ende</label>
                  <input type="time" class="w-full border rounded-full px-4 py-2">
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>
  </div>
</template>

<script setup>
import {ref} from 'vue'
import {BellIcon, ChevronLeftIcon, ChevronRightIcon} from 'lucide-vue-next'

const selectedTab = ref('Heute')
const selectedDate = ref(17)
const selectedDesk = ref(null)
const selectedPeriod = ref('vormittag')

const selectDesk = (desk) => {
  selectedDesk.value = desk
}
</script>

<style scoped>
input[type="time"]::-webkit-calendar-picker-indicator {
  cursor: pointer;
  filter: invert(0.5);
}
</style>